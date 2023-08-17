package tn.dksoft.ebuilding.entities;
//finish Entity
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.enums.Regulation;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
public class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private long invoiceId;
    private LocalDateTime invoiceDate;
    private LocalDateTime datePayment;
    private double totalAmount;
    @Enumerated(EnumType.STRING)
    private Regulation regulation;
    private int deadlineInvoice;
    @OneToMany(mappedBy = "invoice")
    private Collection<Deliverynote> deliverynotes;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "invoice", fetch = FetchType.EAGER)
    private Collection<Invoiceitem> invoiceitems=new ArrayList<>();
}
