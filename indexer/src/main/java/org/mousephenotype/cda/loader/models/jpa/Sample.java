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
public class Sample {
    @Id
    @GeneratedValue
    private Long id;
    private String specimen_id;
    private String colony_id;
    private String genetic_background_strain;
    private String zygosity;
    private String production_center;
    private String litter;
    private String cage;
    @OneToMany
    @JoinTable
    private List<Procedure> procedures;
}
