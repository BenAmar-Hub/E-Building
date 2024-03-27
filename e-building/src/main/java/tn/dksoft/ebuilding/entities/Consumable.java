package tn.dksoft.ebuilding.entities;
//entity finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@DiscriminatorValue("Consumable")
@Entity
public class Consumable extends Tresource{
   private Integer deadlinesApprovisionnement;
}
