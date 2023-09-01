package tn.dksoft.ebuilding.entities;
//Finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type", discriminatorType = DiscriminatorType.STRING)
@Entity
@Table(name = "TResource")
public abstract class Tresource extends AbstractGenericEntity {

    private String labelResource;
    private double unitCost;
    private Integer quantity;
    private Integer quantityMin;
    @OneToMany(mappedBy = "tresource")
    private Collection<Affectationrh>affectationrhs;
    @ManyToMany
    private Collection<Provider>providers=new ArrayList<>();
    @OneToMany(mappedBy = "tresource")
    private Collection<Destock> exits;
    @OneToMany(mappedBy = "tresource")
    private Collection<EntranceNote> entrees;
    @OneToMany(mappedBy = "resource")
    private Collection<OrderItem>orderitems;
    @OneToMany(mappedBy = "resource")
    private Collection<InvoiceItem> invoiceitems;

}
