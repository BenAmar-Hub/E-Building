package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Milestone")
public class Milestone extends AbstractGenericEntity {

    private String milistoneName;
    private String description;
    private LocalDateTime date;
    @ManyToOne
    private Task task;
}
