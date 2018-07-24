package org.mousephenotype.cda.api;

import org.mousephenotype.cda.api.models.Allele;
import org.mousephenotype.cda.api.models.Gene;
import org.mousephenotype.cda.api.repositories.AlleleRepository;
import org.mousephenotype.cda.api.repositories.GeneRepository;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SpringDataRestCustomization extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.withEntityLookup()
                .forRepository(AlleleRepository.class, Allele::getAccessionId, AlleleRepository::findAlleleByAccessionId)
                .forRepository(GeneRepository.class, Gene::getAccessionId, GeneRepository::findGeneByAccessionId);
    }
}
