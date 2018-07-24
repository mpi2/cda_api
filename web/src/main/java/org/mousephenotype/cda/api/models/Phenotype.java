package org.mousephenotype.cda.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phenotype {
    private String mpId;
    private String mpTerm;
    private String mpDefinition;
    private List<String> mpTermSynonym;
    private List<String> procedureStableId;
}
