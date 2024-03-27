package tn.dksoft.ebuilding.entities;
//Finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type", discriminatorType = DiscriminatorType.STRING)
@Entity
@Table(name = "TResource")
public abstract class Tresource extends AbstractGenericEntity {

    private String labelResource;
    private double unitCost;
    private Integer quantity;
    private Integer quantityMin;
    private boolean etatDisposition;
}
