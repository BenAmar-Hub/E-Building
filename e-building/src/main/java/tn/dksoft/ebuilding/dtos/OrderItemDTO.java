package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Consumable;
import tn.dksoft.ebuilding.entities.Torder;
import tn.dksoft.ebuilding.entities.Tresource;
@Data
@EqualsAndHashCode(callSuper=false)
public class OrderItemDTO {
    private Long id;
    private int quantityOrder;
    private int total;
    private double price;
    private ConsumableDTO consumableResource;
    private TorderDTO order;
}
