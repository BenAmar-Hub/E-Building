package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.*;
import tn.dksoft.ebuilding.enums.BillingStatus;
import tn.dksoft.ebuilding.enums.PaymentStatus;
import tn.dksoft.ebuilding.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class TaskDTO {
    private Long id;
    private String nameTask;
    private LocalDateTime startExpectedDate;
    private LocalDateTime endExpectedDate;
    private LocalDateTime priority;
    private double estimatedCost;
    private Integer expectedDuration;
    private Status status;
    private BillingStatus billingStatus;
    private PaymentStatus paymentStatus;
    private String constraintType;
    private Integer ordinal;
    private Integer complete;
    private TscheduleDTO tschedule;
    private TaskDTO parent;
    private List<TaskDTO> taskChields;
}
