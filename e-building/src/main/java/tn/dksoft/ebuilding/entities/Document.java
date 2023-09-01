package tn.dksoft.ebuilding.entities;

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
@Entity
@Table(name = "Document")

public class Document extends AbstractGenericEntity {

    @ManyToOne
    private Task task;
    private String documentWording;
    private LocalDateTime dateOfIssue;
    private LocalDateTime validityDate;
    private String presentation;
    private String valueType;
    private String pathDocument;
    private String docType;


}
