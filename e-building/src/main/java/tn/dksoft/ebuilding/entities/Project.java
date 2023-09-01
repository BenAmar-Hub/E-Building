package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.Status;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Project")
public class Project extends AbstractGenericEntity {

    private String description;
    private String serviceOrder;
    private LocalDateTime startExpectedDate;
    private LocalDateTime endExpectedDtae;
    private double estimatedCost;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany(mappedBy = "project")
    private Collection<Tschedule>tschedules;
    @OneToOne
    private TAddress address;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private HumanResources manager;

}
