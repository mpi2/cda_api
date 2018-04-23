package org.mousephenotype.cda.grapql.services;

import org.mousephenotype.cda.grapql.models.Phenotype;

import java.util.List;

public interface PhenotypeService {

    List<Phenotype> findAllPhenotypes();
    List<Phenotype> findPhenotypesByIds(List<String> ids);
    List<Phenotype> findPhenotypesByTerms(List<String> terms);
    List<Phenotype> findPhenotypesByTerm(String term);

}
