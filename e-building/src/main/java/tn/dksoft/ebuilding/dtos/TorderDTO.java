package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.HumanResources;
import tn.dksoft.ebuilding.entities.OrderItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class TorderDTO {
    private Long id;
    private LocalDateTime orderDate;
    private String status;
    private int deadlineOrder;
    private HumanResourceDTO humanResource;
}
