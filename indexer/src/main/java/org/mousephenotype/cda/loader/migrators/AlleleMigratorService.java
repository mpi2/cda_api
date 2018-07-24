package org.mousephenotype.cda.loader.migrators;

import lombok.NoArgsConstructor;
import org.mousephenotype.cda.loader.models.jpa.Allele;
import org.mousephenotype.cda.loader.models.solr.AlleleLegacy;
import org.mousephenotype.cda.loader.models.solr.EntityLegacy;
import org.mousephenotype.cda.loader.models.solr.GeneLegacy;
import org.mousephenotype.cda.loader.repositories.jpa.AlleleRepository;
import org.mousephenotype.cda.loader.repositories.jpa.GeneRepository;
import org.mousephenotype.cda.loader.repositories.solr.AlleleLegacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class AlleleMigratorService {
    @Autowired
    AlleleLegacyRepository alleleLegacyRepository;

    @Autowired
    AlleleLegacyRepository geneLegacyRepository;

    @Autowired
    GeneRepository geneRepository;

    @Autowired
    AlleleRepository alleleRepository;

    public void migrate(int start, int length){
        PageRequest pageRequest = PageRequest.of(start, length);
        List<AlleleLegacy> allelesSolr = alleleLegacyRepository.findAll(pageRequest).getContent();
        ArrayList<Allele> alleles = new ArrayList<>();
        for(AlleleLegacy alleleLegacy : allelesSolr) {
            alleles.add(alleleLegacy.migrate());
            if(geneRepository.findGeneByAccessionIdEquals(alleleLegacy.getGacc()) == null) {
            }

        }
        alleleRepository.saveAll(alleles);
    }

    public <Entity extends EntityLegacy> void migrate(Entity entity) {

    }
}
