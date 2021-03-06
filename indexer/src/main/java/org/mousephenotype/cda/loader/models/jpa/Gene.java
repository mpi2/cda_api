package org.mousephenotype.cda.loader.models.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
