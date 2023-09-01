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
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Stock")
public class Stock extends AbstractGenericEntity {

    private int quantityInStock;
    private int unitOfMeasurement;
    private LocalDateTime dateStck;
    private double stockAmount;
    @OneToMany(mappedBy = "stock")
    private Collection<EntranceNote> entrees;
    @OneToMany(mappedBy = "stock")
    private Collection<Destock>exits;
}
