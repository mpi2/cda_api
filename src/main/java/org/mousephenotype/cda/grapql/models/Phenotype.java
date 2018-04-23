package org.mousephenotype.cda.grapql.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "phenotypes")
public class Phenotype {

    private ObjectId id;

    private String accessionId;
    private String term;
    private String definition;
    private List<String> synonyms;
    private List<String> narrowSynonyms;
    private List<String> alternateIds;

    // Relationships to other phenotypes
    private Set<Phenotype> ancestors;
    private Set<Phenotype> descendants;
    private Set<Phenotype> parents;
    private Set<Phenotype> children;

    private Set<GenePhenotypeAssociation> genePhenotypeAssociations;


}
