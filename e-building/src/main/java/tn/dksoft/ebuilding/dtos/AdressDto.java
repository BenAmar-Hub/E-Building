package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Entreprise;
import tn.dksoft.ebuilding.entities.Project;

@Data
@EqualsAndHashCode(callSuper=false)
public class AdressDto {
    private Long id;
    private String addressLigne1;
    private String addressLigne2;
    private String addressLigne3;
    private String country;
    private String town;
    private Integer postalCode;
    private Integer longitude;
    private Integer latitude;
}
