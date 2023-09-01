package tn.dksoft.ebuilding.dtos;

import lombok.Data;

import java.io.Serializable;
@Data
public class CustomerDTO extends EntrepriseDTO {
    private Long id;
    private String nameE;
    private String contactE;
    private String emailE;
    private String faxE;
    private String mobileE;
    private String desktopMobileE;
    private String siteWebAddress;
    private AdressDto adressDto;
}
