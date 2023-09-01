package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.BillingStatus;
import tn.dksoft.ebuilding.enums.PaymentStatus;
import tn.dksoft.ebuilding.enums.Status;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
//finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Task")
public class Task extends AbstractGenericEntity {

    private String nameTask;
    private LocalDateTime startExpectedDate;
    private LocalDateTime endExpectedDate;
    private LocalDateTime priority;
    private double estimatedCost;
    private Integer expectedDuration;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private BillingStatus billingStatus;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    private String constraintType;
    private Integer ordinal;
    private Integer complete;
    @OneToMany(mappedBy = "task")
    private Collection<Affectationrh>affectationrhs;
    @OneToMany(mappedBy = "task")
    private Collection<Document>documents;
    @ManyToOne
    private Tschedule tschedule;
    @ManyToOne
    private Task parent;
    @OneToMany(mappedBy = "parent")
    private List<Task> taskChields;
    @OneToMany(mappedBy = "taskFrom")
    private Collection<Link> linksFrom;
    @OneToMany(mappedBy = "taskTo")
    private Collection<Link> linksTO;
    @OneToMany(mappedBy = "task")
    private Collection<Milestone> milestones;

}
