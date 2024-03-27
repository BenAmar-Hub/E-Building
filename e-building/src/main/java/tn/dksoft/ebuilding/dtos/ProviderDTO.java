package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tn.dksoft.ebuilding.entities.Consumable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"type"})
public class ProviderDTO extends EntrepriseDTO {
    private Long id;
    private String nameE;
    private String contactE;
    private String emailE;
    private String faxE;
    private String mobileE;
    private String desktopPhoneE;
    private String siteWebAdress;
    private List<ConsumableDTO> consumablesResources;
}
