package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Consumable;
import tn.dksoft.ebuilding.entities.Stock;
import tn.dksoft.ebuilding.entities.Tresource;

import java.time.LocalDateTime;
@Data
@EqualsAndHashCode(callSuper=false)
public class DestockDTO {
    private Long id;
    private Integer quantityExit;
    private LocalDateTime date;
    private double unitAmount;
    private boolean transfert;
    private ConsumableDTO consumableResource;
    private StockDTO stock;
}
