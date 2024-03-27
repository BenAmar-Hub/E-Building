package tn.dksoft.ebuilding.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;
import tn.dksoft.ebuilding.enums.DocType;
import tn.dksoft.ebuilding.enums.DocValue;
import tn.dksoft.ebuilding.enums.Presentation;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Document")

public class Document extends AbstractGenericEntity {

    private String documentWording;
    private LocalDateTime dateOfIssue;
    private LocalDateTime validityDate;
    private Presentation presentation;
    private DocValue valueType;
    private String pathDocument;
    private DocType docType;
    @ManyToOne
    private Task task;


}
