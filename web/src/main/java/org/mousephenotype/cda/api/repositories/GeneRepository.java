package org.mousephenotype.cda.api.repositories;

import org.mousephenotype.cda.api.models.Gene;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface GeneRepository extends CrudRepository<Gene, String>, QueryByExampleExecutor<Gene> {

    Gene findGeneBySymbol(String geneSymbol);
}
