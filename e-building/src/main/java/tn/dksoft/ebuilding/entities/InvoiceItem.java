package tn.dksoft.ebuilding.entities;
//finishEntity
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.Objects;
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "InvoiceItem")
public class InvoiceItem extends AbstractGenericEntity {
    private double price;
    private int qty;
    private int total;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Consumable consumableResource;
   }
