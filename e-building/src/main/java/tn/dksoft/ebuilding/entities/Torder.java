package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.Status;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
//Entity Finish
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TOrder")
public class Torder extends AbstractGenericEntity {

    private LocalDateTime orderDate;
    private String status;
    private int deadlineOrder;
    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private Collection<OrderItem> orderitems=new ArrayList<>();
    @ManyToOne
    private HumanResources humanResource;
}
