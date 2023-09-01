package tn.dksoft.ebuilding.dtos;

import lombok.Data;

@Data
public class AdressDto {
    private long id;
    private String addressLigne1;
    private String addressLigne2;
    private String addressLigne3;
    private String country;
    private String town;
    private Integer postalCode;
    private Integer longitude;
    private Integer latitude;
}
