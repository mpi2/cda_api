package org.mousephenotype.cda.api.services;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.mousephenotype.cda.api.models.Allele;
import org.mousephenotype.cda.api.repositories.AlleleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@AllArgsConstructor
public class GraphQLQuery implements GraphQLQueryResolver {

    @Autowired
    private AlleleRepository alleleRepository;

    public List<Allele> getAlleles() {
        List<Allele> target = new ArrayList<>();
        alleleRepository.findAll().forEach(target::add);
        return target;
    }

    public List<Allele> getAllelesByGeneSymbol(String geneSymbol) {
        return  alleleRepository.findAllelesByGene_Symbol(geneSymbol);
    }

    public List<Allele> getAllelesByExample(Allele filter) {
        List<Allele> target = new ArrayList<>();
        alleleRepository.findAll(Example.of(filter)).forEach(target::add);
        return target;
    }

}
