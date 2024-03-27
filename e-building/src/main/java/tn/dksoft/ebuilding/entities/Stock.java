package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Stock")
public class Stock extends AbstractGenericEntity {

    private int quantityInStock;
    private int unitOfMeasurement;
    private LocalDateTime dateStck;
    private double stockAmount;


}
