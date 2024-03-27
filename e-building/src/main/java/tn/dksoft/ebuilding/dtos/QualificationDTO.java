package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.HumanResources;

import java.util.Collection;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class QualificationDTO {
    private Long id;
    private String qualificationName;
    private double tariffRate;
    private int tariffAssignment;
}
