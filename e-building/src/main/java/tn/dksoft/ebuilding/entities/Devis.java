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
import java.util.List;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Devis")
public class Devis extends AbstractGenericEntity {

    private LocalDateTime dateDevis;
    @ManyToOne
    private Customer customer;
}
