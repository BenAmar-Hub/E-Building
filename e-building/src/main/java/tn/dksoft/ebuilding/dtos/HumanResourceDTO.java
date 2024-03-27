package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=true)
@JsonIgnoreProperties(value = {"type"})
public class HumanResourceDTO extends TresourceDTO {
    private Long id;
    private String nameRH;
    private boolean etatDisposition;
    //private String labelResource;
    //private double unitCost;
    //private Integer quantity;
   // private Integer quantityMin;
    //private Tuser user;
    private List<QualificationDTO> qualifications;
}
