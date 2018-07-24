package org.mousephenotype.cda.loader.repositories.jpa;

import org.mousephenotype.cda.loader.models.jpa.Allele;
import org.springframework.data.repository.CrudRepository;

public interface AlleleRepository extends CrudRepository<Allele, Long> {
}
