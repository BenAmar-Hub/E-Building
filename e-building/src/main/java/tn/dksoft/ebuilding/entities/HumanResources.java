package tn.dksoft.ebuilding.entities;
//Entity Finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("HumanResource")
@Entity
public class HumanResources extends Renewable{
    private String nameRH;
    @OneToOne(mappedBy = "manager")
   private Project project;
    @OneToOne
    private Tuser user;
    @OneToMany(mappedBy = "humanResource")
    private Collection<Torder> orders;
    @ManyToMany(mappedBy = "humanResources", fetch = FetchType.EAGER)
    private Collection<Qualification> qualifications=new ArrayList<>();
}
