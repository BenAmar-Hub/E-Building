package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.io.Serializable;
//finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAddress")
public class TAddress extends AbstractGenericEntity {

    private String addressLigne1;
    private String addressLigne2;
    private String addressLigne3;
    private String country;
    private String town;
    private Integer postalCode;
    private Integer longitude;
    private Integer latitude;
    @OneToOne(mappedBy = "address" )
    private Project project;
    @ManyToOne
    private Entreprise entreprise;
}
