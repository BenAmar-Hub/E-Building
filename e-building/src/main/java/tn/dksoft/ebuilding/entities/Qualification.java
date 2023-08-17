package tn.dksoft.ebuilding.entities;
//Entity finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Entity
public class Qualification {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long codeQualif;
    private String qualificationName;
    private double tariffRate;
    private int tariffAssignment;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Humanresources> humanResources=new ArrayList<>();
}
