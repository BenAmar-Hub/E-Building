package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Destock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long codeDS;
    private Integer quantityExit;
    private LocalDateTime date;
    private double unitAmount;
    private boolean transfert;
    @ManyToOne
    private Tresource tresource;
    @ManyToOne
    private Stock stock;
}
