package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("Material")
@Entity
@Table(name = "Material")
public class Material extends Renewable{
    private String model;
    private String mark;
}
