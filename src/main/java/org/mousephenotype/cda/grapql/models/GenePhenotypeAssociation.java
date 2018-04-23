package org.mousephenotype.cda.grapql.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "gene-phenotype-association")
public class GenePhenotypeAssociation {

    private ObjectId id;

    private Float pValue;

    // Relationship to phenotypes
    private Phenotype phenotype;


}
