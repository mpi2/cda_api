package org.mousephenotype.cda.loader.repositories.jpa;

import org.mousephenotype.cda.loader.models.jpa.Gene;
import org.springframework.data.repository.CrudRepository;

public interface GeneRepository extends CrudRepository<Gene, Long> {
    public Gene findGeneByAccessionIdEquals(String accessionId);
}
