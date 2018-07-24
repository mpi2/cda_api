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
public class Procedure {
    @Id
    @GeneratedValue
    private Long id;
    private String procedureId;
    private String name;
    private String description;
    @Column(name = "procedure_group")
    private String group;
    @OneToMany
    @JoinTable
    private List<Parameter> parameters;
}
