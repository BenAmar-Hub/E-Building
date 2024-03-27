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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Project")
public class Project extends AbstractGenericEntity {

    private String description;
    private String serviceOrder;
    private LocalDateTime startExpectedDate;
    private LocalDateTime endExpectedDate;
    private double estimatedCost;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne
    private TAddress address;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private HumanResources manager;

}
