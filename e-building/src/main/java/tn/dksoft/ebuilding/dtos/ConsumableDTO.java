package tn.dksoft.ebuilding.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
public class ConsumableDTO extends TresourceDTO {
    private Long id;
    private String labelResource;
    private double unitCost;
    private Integer quantity;
    private Integer quantityMin;
    private Integer deadlinesApprovisionnement;
    private boolean etatDisposition;
}
