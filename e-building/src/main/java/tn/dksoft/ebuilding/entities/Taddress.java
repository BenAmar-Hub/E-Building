package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Objects;
//finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Taddress {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long codeAddress;
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
