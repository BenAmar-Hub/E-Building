package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.Objects;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OrderItem")
public class OrderItem extends AbstractGenericEntity {

    private int quantityOrder;
    @Transient
    private int total;
    private double price;
    @ManyToOne
    private Tresource resource;
    @ManyToOne
    private Torder order;
   }
