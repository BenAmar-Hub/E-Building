package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.business.TaskService;
import tn.dksoft.ebuilding.dtos.TaskDTO;
import tn.dksoft.ebuilding.entities.Task;

@RestController
@RequestMapping("/api/task")
public class TaskController extends GenericController<Task,Long, TaskDTO> {
    @Autowired
    public TaskController(TaskService service) {
        super(service);
    }
}
