package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Customer;
import tn.dksoft.ebuilding.entities.DeliveryNote;
import tn.dksoft.ebuilding.entities.InvoiceItem;
import tn.dksoft.ebuilding.enums.Regulation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class InvoiceDTO {
    private Long id;
    private LocalDateTime invoiceDate;
    private LocalDateTime datePayment;
    private double totalAmount;
    private Regulation regulation;
    private int deadlineInvoice;
    private CustomerDTO customer;
}
