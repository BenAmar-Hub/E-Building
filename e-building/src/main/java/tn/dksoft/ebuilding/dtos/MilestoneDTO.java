package tn.dksoft.ebuilding.dtos;



import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Task;

import java.time.LocalDateTime;
@Data
@EqualsAndHashCode(callSuper=false)
public class MilestoneDTO {
    private Long id;
    private String milistoneName;
    private String description;
    private LocalDateTime date;
    private TaskDTO task;
}
