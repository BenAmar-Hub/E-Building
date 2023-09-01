package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.TypeLink;

import java.util.Objects;
// Finish Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Link")
public class Link extends AbstractGenericEntity {

    @Enumerated(EnumType.STRING)
    private TypeLink typeLink;
    @ManyToOne
    private Task taskFrom;
    @ManyToOne
    private Task taskTo;

}
