package org.mousephenotype.cda.loader.models.jpa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Observation {
    @Id
    @GeneratedValue
    private Long id;
    private String value;
    private String type;
    private String sequenceId;
    private Date timestamp;
    @ManyToOne
    @JoinColumn
    private PhenotypingCenter phenotypingCenter;
    @OneToMany
    @JoinTable
    private List<Media> media;
}
