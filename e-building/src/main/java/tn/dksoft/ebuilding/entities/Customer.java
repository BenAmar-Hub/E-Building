package tn.dksoft.ebuilding.entities;
//Entity Finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@DiscriminatorValue("customer")
public class Customer extends  Entreprise{
    @OneToMany(mappedBy = "customer")
    private Collection<Project>projects;
    @OneToOne
    private Tuser user;
    @OneToMany(mappedBy = "customer")
    private Collection<Devis> devis;
    @OneToMany(mappedBy = "customer")
    private Collection<Invoice> invoices;
}
