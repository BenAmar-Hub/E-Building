package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Customer;
import tn.dksoft.ebuilding.entities.DeliveryNote;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class DevisDTO {
    private Long id;
    private LocalDateTime dateDevis;
    private CustomerDTO customer;

}
