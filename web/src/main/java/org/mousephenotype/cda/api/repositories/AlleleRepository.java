package org.mousephenotype.cda.api.repositories;

import org.mousephenotype.cda.api.models.Allele;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlleleRepository extends CrudRepository<Allele, String>, QueryByExampleExecutor<Allele> {
    List<Allele> findAllelesByGene_Symbol(String symbol);
}
