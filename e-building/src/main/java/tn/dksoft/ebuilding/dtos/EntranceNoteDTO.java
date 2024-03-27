package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Consumable;
import tn.dksoft.ebuilding.entities.Stock;


import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper=false)
public class EntranceNoteDTO {
    private Long id;
    private Integer inputQuantity;
    private LocalDateTime date;
    private double unitAmount;
    private boolean transfert;
    private ConsumableDTO consumableResource;
    private StockDTO stock;
}
