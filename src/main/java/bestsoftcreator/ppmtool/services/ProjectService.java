package bestsoftcreator.ppmtool.services;

import bestsoftcreator.ppmtool.domain.Project;
import bestsoftcreator.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project SaveOrUpdateProject(Project project)
    {
        //Logic
        return  projectRepository.save(project);
    }
}
