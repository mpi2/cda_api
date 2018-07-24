package org.mousephenotype.cda.loader.models.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class DiseaseModel {
    @Id
    @GeneratedValue
    private Long id;
    private String strategy;
    @OneToOne
    @JoinColumn
    private Disease disease;
    @OneToMany
    @JoinTable
    private List<Gene> genes;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> phenotypeTerms;

}
