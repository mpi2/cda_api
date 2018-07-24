package org.mousephenotype.cda.api.models;

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
public class Parameter {
    @Id
    @GeneratedValue
    private Long id;
    private String parameterId;
    private String name;
    private String description;
    @OneToMany
    @JoinTable
    private List<Observation> observations;
}
