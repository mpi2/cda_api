package org.mousephenotype.cda.grapql.utils;

import graphql.schema.idl.RuntimeWiring;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

@Component
public class GraphQlUtilities {

    private AllPhenotypeDataFetcher phenotypesFetcher;

    @Inject
    GraphQlUtilities(AllPhenotypeDataFetcher allPhenotypesDataFetcher) {
        this.phenotypesFetcher = allPhenotypesDataFetcher;

    }

    public RuntimeWiring buildRuntimeWiring() {
        return newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("phenotypes", phenotypesFetcher)).build();
    }
}
