package org.mousephenotype.cda.grapql.services.implementation;

import org.mousephenotype.cda.grapql.models.Phenotype;
import org.mousephenotype.cda.grapql.repositories.PhenotypeRepository;
import org.mousephenotype.cda.grapql.services.PhenotypeService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PhenotypeServiceImpl implements PhenotypeService {
    private final PhenotypeRepository phenotypeRepository;

    @Inject
    PhenotypeServiceImpl(PhenotypeRepository phenotypeRepository){
        this.phenotypeRepository = phenotypeRepository;
    }

    @Override
    public List<Phenotype> findAllPhenotypes() {
        return Stream.of(phenotypeRepository.findAll()).map(x -> (Phenotype) x).collect(Collectors.toList());
    }

    @Override
    public List<Phenotype> findPhenotypesByIds(List<String> ids) {
        return phenotypeRepository.findByIdIn(ids);
    }

    @Override
    public List<Phenotype> findPhenotypesByTerms(List<String> terms) {
        return phenotypeRepository.findByTermIn(terms);
    }

    @Override
    public List<Phenotype> findPhenotypesByTerm(String term) {
        return phenotypeRepository.findByTerm(term);
    }

}
