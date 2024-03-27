package tn.dksoft.ebuilding.entities;
// Entity Finish
import jakarta.persistence.*;
import lombok.*;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Affectationrh")
public class Affectationrh extends AbstractGenericEntity {

    private Integer nbreDaysPerMan;
    private Integer nbreIntervenersMin;
    private Integer nbreIntervenersMax;
    private Integer nbreIntervenersOp;
    @ManyToOne
    private Task task;
    @ManyToOne
    private HumanResources humanResource;

}
