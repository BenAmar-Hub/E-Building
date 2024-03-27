package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.BillingStatus;
import tn.dksoft.ebuilding.enums.PaymentStatus;
import tn.dksoft.ebuilding.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
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

    @ManyToOne
    private Tschedule tschedule;
    @ManyToOne
    private Task parent;
    @OneToMany
    private List<Task> taskChields=new ArrayList<>();

}
