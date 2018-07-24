package org.mousephenotype.cda.loader.repositories.solr;

import org.mousephenotype.cda.loader.models.solr.AlleleLegacy;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlleleLegacyRepository extends SolrCrudRepository<AlleleLegacy, String> {
}
