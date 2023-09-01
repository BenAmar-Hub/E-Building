package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.Regulation;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Invoice")
public class Invoice extends AbstractGenericEntity {

    private LocalDateTime invoiceDate;
    private LocalDateTime datePayment;
    private double totalAmount;
    @Enumerated(EnumType.STRING)
    private Regulation regulation;
    private int deadlineInvoice;
    @OneToMany(mappedBy = "invoice")
    private Collection<DeliveryNote> deliverynotes;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER)
    private Collection<InvoiceItem> invoiceitems=new ArrayList<>();
}
