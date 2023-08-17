package tn.dksoft.ebuilding.entities;
//entity finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("consumable")
@Entity
public class Consumable extends Tresource{
   private Integer deadlinesApprovisionnement;
}
