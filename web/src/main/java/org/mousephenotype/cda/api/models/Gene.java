package org.mousephenotype.cda.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Gene {
    @Id
    @GeneratedValue
    private Long id;
    private String accessionId;
    private String symbol;
    private String name;
    private String seqRegionStrand;
    private String seqRegionStart;
    private String seqRegionEnd;
    private String synonyms;
    @ManyToOne
    @JoinColumn
    private HumanGeneOrthologue humanGeneOrthologue;
}
