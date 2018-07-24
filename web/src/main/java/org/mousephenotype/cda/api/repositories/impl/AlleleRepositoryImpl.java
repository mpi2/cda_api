package org.mousephenotype.cda.api.repositories.impl;

import org.mousephenotype.cda.api.repositories.AlleleRepositoryCustom;

import java.util.List;

public class AlleleRepositoryImpl implements AlleleRepositoryCustom {

   /* @Autowired
    GeneRepository geneRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Allele> findAllelesByGene_Symbol(String geneSymbol) {
        ObjectId geneId = geneRepository.findGeneBySymbol(geneSymbol).getId();
        Query query = new Query();
        query.addCriteria(Criteria.where("gene.$id").is(geneId));
        return mongoTemplate.find(query, Allele.class, "alleles");
    }*/
}
