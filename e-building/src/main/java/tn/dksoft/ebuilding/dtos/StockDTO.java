package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Destock;
import tn.dksoft.ebuilding.entities.EntranceNote;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class StockDTO {
    private Long id;
    private int quantityInStock;
    private int unitOfMeasurement;
    private LocalDateTime dateStck;
    private double stockAmount;

}
