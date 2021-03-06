package bestsoftcreator.ppmtool.web;

import bestsoftcreator.ppmtool.domain.Project;
import bestsoftcreator.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectService  projectService;

    @PostMapping
    public ResponseEntity<?> createdNewProject(@Valid @RequestBody Project project,
                                                     BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
        {
            return new ResponseEntity<String>("Invalid object",HttpStatus.BAD_REQUEST);
        }

        Project p = projectService.SaveOrUpdateProject(project);
        return new ResponseEntity<Project>(
                p,HttpStatus.CREATED
        );
    }
}
