package tn.dksoft.ebuilding.entities;
//Entity Finish
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@DiscriminatorValue("Customer")
public class Customer extends  Entreprise {
    @OneToOne
    private Tuser user;
}
