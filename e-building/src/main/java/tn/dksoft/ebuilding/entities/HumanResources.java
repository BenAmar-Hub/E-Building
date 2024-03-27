package tn.dksoft.ebuilding.entities;
//Entity Finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@DiscriminatorValue("HumanResource")
@Entity
public class HumanResources extends Tresource{
    private String nameRH;
    @OneToOne
    private Tuser user;

    @ManyToMany
    private List<Qualification> qualifications=new ArrayList<>();
}
