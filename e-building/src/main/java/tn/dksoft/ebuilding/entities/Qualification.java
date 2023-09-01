package tn.dksoft.ebuilding.entities;
//Entity finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Qualification")
public class Qualification extends AbstractGenericEntity {

    private String qualificationName;
    private double tariffRate;
    private int tariffAssignment;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<HumanResources> humanResources=new ArrayList<>();
}
