package tn.dksoft.ebuilding.entities;
// Entity Finish
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Affectationrh {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long codeARH;
    private Integer nbreDaysPerMan;
    private Integer nbreIntervenersMin;
    private Integer nbreIntervenersMax;
    private Integer nbreIntervenersOp;
    @ManyToOne
    private Task task;
    @ManyToOne
    private Tresource tresource;

}
