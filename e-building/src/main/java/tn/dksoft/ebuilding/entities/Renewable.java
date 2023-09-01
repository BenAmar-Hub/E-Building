package tn.dksoft.ebuilding.entities;
//finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("Renewable")
@Entity
public class Renewable extends Tresource{
  private boolean etatDisposition;
}
