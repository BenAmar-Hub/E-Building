package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Task;
import tn.dksoft.ebuilding.enums.TypeLink;
@Data
@EqualsAndHashCode(callSuper=false)
public class LinkDTO {
    private Long id;
    private TypeLink typeLink;
    private TaskDTO taskFrom;
    private TaskDTO taskTo;
}
