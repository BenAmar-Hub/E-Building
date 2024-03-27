package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@JsonIgnoreProperties(value = {"type"})
public class MaterialDTO extends TresourceDTO {
    private Long id;
    private String model;
    private String mark;
    private boolean etatDisposition;
    private String labelResource;
    private double unitCost;
    private Integer quantity;
    private Integer quantityMin;
}
