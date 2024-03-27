package tn.dksoft.ebuilding.dtos;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.HumanResources;
import tn.dksoft.ebuilding.entities.Task;

@Data
@EqualsAndHashCode(callSuper=false)
public class AffectationRHDTO {
    private Long id;
    private Integer nbreDaysPerMan;
    private Integer nbreIntervenersMin;
    private Integer nbreIntervenersMax;
    private Integer nbreIntervenersOp;
    private TaskDTO task;
    private HumanResourceDTO humanResource;
}
