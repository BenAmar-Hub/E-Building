package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.TAddress;
import tn.dksoft.ebuilding.entities.Tschedule;
import tn.dksoft.ebuilding.enums.Status;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class ProjectDto {
    private Long id;
    private String description;
    private String serviceOrder;
    private LocalDateTime startExpectedDate;
    private LocalDateTime endExpectedDate;
    private double estimatedCost;
    private Status status;
    private CustomerDTO customer;
    private HumanResourceDTO manager;
    private AdressDto address;
}
