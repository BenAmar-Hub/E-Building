package tn.dksoft.ebuilding.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("Provider")
public class Provider extends Entreprise {
    @ManyToMany(mappedBy = "providers")
    private Collection<Tresource>resources=new ArrayList<>();
}