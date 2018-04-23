package org.mousephenotype.cda.grapql.repositories;

import org.bson.types.ObjectId;
import org.mousephenotype.cda.grapql.models.Phenotype;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhenotypeRepository extends PagingAndSortingRepository<Phenotype, ObjectId> {

    List<Phenotype> findByIdIn(@Param("ids") List<String> ids);
    List<Phenotype> findByTermIn(@Param("terms") List<String> terms);
    List<Phenotype> findByTerm(@Param("term") String term);

}
