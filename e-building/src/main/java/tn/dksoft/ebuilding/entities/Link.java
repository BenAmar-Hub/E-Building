package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.enums.TypeLink;

import java.util.Objects;
// Finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Link {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long idLink;
    @Enumerated(EnumType.STRING)
    private TypeLink typeLink;
    @ManyToOne
    private Task taskFrom;
    @ManyToOne
    private Task taskTo;

}
