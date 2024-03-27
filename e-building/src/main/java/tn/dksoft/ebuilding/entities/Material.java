package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@DiscriminatorValue("Material")
@Entity
@Table(name = "Material")
public class Material extends Tresource{
    private String model;
    private String mark;
}
