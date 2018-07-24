package org.mousephenotype.cda.loader.migrators;

import lombok.NoArgsConstructor;
import org.mousephenotype.cda.loader.models.jpa.Allele;
import org.mousephenotype.cda.loader.models.jpa.Gene;
import org.mousephenotype.cda.loader.models.solr.AlleleLegacy;
import org.mousephenotype.cda.loader.models.solr.GeneLegacy;
import org.mousephenotype.cda.loader.repositories.jpa.AlleleRepository;
import org.mousephenotype.cda.loader.repositories.jpa.GeneRepository;
import org.mousephenotype.cda.loader.repositories.solr.AlleleLegacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class GeneMigratorService {
    @Autowired
    AlleleLegacyRepository alleleLegacyRepository;

    @Autowired
    AlleleLegacyRepository geneLegacyRepository;

    @Autowired
    GeneRepository geneRepository;

    @Autowired
    AlleleRepository alleleRepository;

    public Gene migrate(GeneLegacy legacy) {
        Gene gene = new Gene();
        gene.setAccessionId(legacy.getAccessionId());
        gene.setSymbol(legacy.getSymbol());
        gene.setName(legacy.getName());
        gene.setSeqRegionStart(legacy.getSeqRegionStart());
        gene.setSeqRegionEnd(legacy.getSeqRegionEnd());
        gene.setSynonyms(legacy.getSynonyms().toString());
        geneRepository.save(gene);
        return gene;
    }
}
