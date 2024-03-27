package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Consumable;
import tn.dksoft.ebuilding.entities.Invoice;
import tn.dksoft.ebuilding.entities.Tresource;

@Data
@EqualsAndHashCode(callSuper=false)
public class InvoiceItemDTO {
    private Long id;
    private double price;
    private int qty;
    private int total;
    private InvoiceDTO invoice;
    private ConsumableDTO consumableResource;
}
