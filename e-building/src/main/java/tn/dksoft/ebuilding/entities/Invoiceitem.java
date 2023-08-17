package tn.dksoft.ebuilding.entities;
//finishEntity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Invoiceitem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long id;
    private double price;
    private int qty;
    private int total;
    @ManyToOne
    private Invoice invoice;
    @ManyToOne
    private Tresource resource;
   }
