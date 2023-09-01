package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;
//Finich Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TSchedule")
public class Tschedule extends AbstractGenericEntity {

    private String designation;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @OneToMany(mappedBy = "tschedule")
    private Collection<Task>tasks;
    @ManyToOne
    private Project project;
}
