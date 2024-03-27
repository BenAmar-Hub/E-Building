package tn.dksoft.ebuilding.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Task;
import tn.dksoft.ebuilding.enums.DocType;
import tn.dksoft.ebuilding.enums.DocValue;
import tn.dksoft.ebuilding.enums.Presentation;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper=false)
public class DocumentDTO {
    private Long id;
    private String documentWording;
    private LocalDateTime dateOfIssue;
    private LocalDateTime validityDate;
    private Presentation presentation;
    private DocValue valueType;
    private String pathDocument;
    private DocType docType;
    private TaskDTO task;

}
