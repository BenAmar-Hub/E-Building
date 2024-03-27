package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.ProjectService;
import tn.dksoft.ebuilding.dtos.ProjectDto;
import tn.dksoft.ebuilding.entities.Project;
@RestController
@RequestMapping("/api/project")
public class ProjectController extends GenericController<Project, Long, ProjectDto> {
    @Autowired
    public ProjectController(ProjectService service) {
        super(service);
    }
}
