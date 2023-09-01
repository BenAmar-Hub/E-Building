package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.Collection;
import java.util.Objects;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type",length = 20)
@Entity
@Table(name = "Entreprise")
public abstract class Entreprise extends AbstractGenericEntity {

    private String nameE;
    private String contactE;
    private String emailE;
    private String faxE;
    private String mobileE;
    private String desktopPhoneE;
    private String siteWebAdress;
    @OneToMany(mappedBy = "entreprise")
    private Collection<TAddress> addresses;
}
