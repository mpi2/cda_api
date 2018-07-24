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
public class Allele {
    @Id
    @GeneratedValue
    private Long id;
    private String accessionId;
    private String symbol;
    private String alleleMap;
    @ManyToOne
    @JoinColumn
    private Gene gene;
    @OneToMany
    @JoinTable
    private List<Product> products;
}