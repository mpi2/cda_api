package org.mousephenotype.cda.loader.migrators;

import lombok.NoArgsConstructor;
import org.mousephenotype.cda.loader.models.jpa.Allele;
import org.mousephenotype.cda.loader.models.jpa.Gene;
import org.mousephenotype.cda.loader.models.solr.AlleleLegacy;
import org.mousephenotype.cda.loader.models.solr.GeneLegacy;
import org.mousephenotype.cda.loader.repositories.jpa.AlleleRepository;
import org.mousephenotype.cda.loader.repositories.jpa.GeneRepository;
import org.mousephenotype.cda.loader.repositories.solr.AlleleLegacyRepository;
import org.mousephenotype.cda.loader.repositories.solr.GeneLegacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class AlleleMigratorService {
    @Autowired
    AlleleLegacyRepository alleleLegacyRepository;

    @Autowired
    GeneLegacyRepository geneLegacyRepository;

    @Autowired
    GeneRepository geneRepository;

    @Autowired
    AlleleRepository alleleRepository;

    @Autowired
    GeneMigratorService geneMigratorService;

    public void migrateAll(int start, int length){
        PageRequest pageRequest = PageRequest.of(start, length);
        List<AlleleLegacy> allelesSolr = alleleLegacyRepository.findAll(pageRequest).getContent();
        for(AlleleLegacy alleleLegacy : allelesSolr) {
            migrate(alleleLegacy);
        }
    }

    public Allele migrate(AlleleLegacy legacy){
        Allele allele = new Allele();

        allele.setAccessionId(legacy.getDocId());
        allele.setSymbol(legacy.getAlleleSymbol());
        allele.setAlleleMap(legacy.getAlleleImage());
        allele.setMutationType(legacy.getAlleleType());
        Gene gene = geneRepository.findGeneByAccessionIdEquals(legacy.getGacc());
        if(gene == null) {
            GeneLegacy geneLegacy = geneLegacyRepository.findGeneLegacyByAccessionIdEquals(legacy.getGacc());
            gene = geneMigratorService.migrate(geneLegacy);
        }
        allele.setGene(gene);
        alleleRepository.save(allele);
        return allele;
    }

}
