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
public class PhenotypeTerm {
    @Id
    @GeneratedValue
    private Long id;
    private String ontology;
    private String ontologyTerm;
    private String definition;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> synonyms;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> relatedSynonyms;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> parents;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> children;
    @OneToMany
    @JoinTable
    private List<PhenotypeTerm> topLevelTerm;
}
