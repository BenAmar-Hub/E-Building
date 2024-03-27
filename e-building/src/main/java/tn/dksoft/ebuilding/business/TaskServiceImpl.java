package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.TaskDTO;
import tn.dksoft.ebuilding.entities.Task;
import tn.dksoft.ebuilding.mappers.GenericMapper;
import tn.dksoft.ebuilding.mappers.TaskMapper;
import tn.dksoft.ebuilding.repositories.GenericRepository;
import tn.dksoft.ebuilding.repositories.TaskRepository;

@Service(value = "taskService")
@Transactional
public class TaskServiceImpl extends GenericServiceImpl<Task, Long, TaskDTO> implements TaskService {
    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        super(taskRepository,taskMapper);
    }
}
