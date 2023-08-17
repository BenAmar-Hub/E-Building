package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Stock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long stockId;
    private int quantityInStock;
    private int unitOfMeasurement;
    private LocalDateTime dateStck;
    private double stockAmount;
    @OneToMany(mappedBy = "stock")
    private Collection<EntranceNote> entrees;
    @OneToMany(mappedBy = "stock")
    private Collection<Destock>exits;
}
