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
public class StatisticalResult {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    @JoinTable
    private List<Observation> observations;
    @OneToOne
    @JoinColumn
    private PhenotypeTerm phenotypeTerm;
    private String pValue;
    private String status;
    private Boolean significant;
    private String workflow;
}
