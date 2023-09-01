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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EntranceNote")
public class EntranceNote extends AbstractGenericEntity {

    private Integer inputQuantity;
    private LocalDateTime date;
    private double unitAmount;
    private boolean transfert;
    @ManyToOne
    private Tresource tresource;
    @ManyToOne
    private Stock stock;
}
