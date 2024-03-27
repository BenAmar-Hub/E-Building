package tn.dksoft.ebuilding.entities;
//Finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "DeliveryNote")
public class DeliveryNote extends AbstractGenericEntity {
    private LocalDateTime dateValidBl;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Devis devis;
}
