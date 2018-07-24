package org.mousephenotype.cda.loader.repositories.solr;

import org.mousephenotype.cda.loader.models.solr.GeneLegacy;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface GeneLegacyRepository extends SolrCrudRepository<GeneLegacy, String> {
    GeneLegacy findGeneLegacyByAccessionIdEquals(String accessionId);
}
