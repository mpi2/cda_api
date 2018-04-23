package org.mousephenotype.cda.grapql.utils;


import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.mousephenotype.cda.grapql.models.Phenotype;
import org.mousephenotype.cda.grapql.services.PhenotypeService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
@Component
public class AllPhenotypeDataFetcher implements DataFetcher<List<Phenotype>> {

    private PhenotypeService phenotypeService;

    @Inject
    AllPhenotypeDataFetcher(PhenotypeService phenotypeService){
        this.phenotypeService = phenotypeService;
    }

    @Override
    public List<Phenotype> get(DataFetchingEnvironment env) {
        return phenotypeService.findAllPhenotypes();
    }
}