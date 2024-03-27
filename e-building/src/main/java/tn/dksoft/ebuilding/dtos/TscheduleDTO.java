package tn.dksoft.ebuilding.dtos;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tn.dksoft.ebuilding.entities.Project;
import tn.dksoft.ebuilding.entities.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class TscheduleDTO {
    private Long id;
    private String designation;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ProjectDto project;
}
