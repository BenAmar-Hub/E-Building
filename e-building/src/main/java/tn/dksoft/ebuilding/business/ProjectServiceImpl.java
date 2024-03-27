package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.ProjectDto;
import tn.dksoft.ebuilding.entities.Project;
import tn.dksoft.ebuilding.mappers.ProjectMapper;
import tn.dksoft.ebuilding.repositories.ProjectRepository;

@Service
@Transactional
public class ProjectServiceImpl extends GenericServiceImpl<Project, Long, ProjectDto> implements ProjectService {
    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        super(projectRepository, projectMapper);
    }
}