package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Devis;
import tn.dksoft.ebuilding.entities.Invoice;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper=false)
public class DeliveryNoteDTO {
    private Long id;
    private LocalDateTime dateValidBl;
    private InvoiceDTO invoice;
    private DevisDTO devis;
}
