package bestsoftcreator.ppmtool.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @NotBlank(message = "Project name is required")
    private String projectName;
    @NotBlank(message = "Project identifier is required")
    @Size(min=4,max=5,message = "Please use minimum 4 and 5 characters")
    @Column(updatable = false,unique = true)
    private String projectIdentifier;

    @NotBlank(message = "Pescription identifirt is required")
    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date sart_date;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date end_date;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date ceated_At;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updated_At;

    public Project()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public Date getCeated_At() {
        return ceated_At;
    }

    public void setCeated_At(Date ceated_At) {
        this.ceated_At = ceated_At;
    }

    public Date getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(Date updated_At) {
        this.updated_At = updated_At;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSart_date() {
        return sart_date;
    }

    public void setSart_date(Date sart_date) {
        this.sart_date = sart_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @PrePersist
    protected void  onCreated()
    {
        this.ceated_At=new Date();
    }
    @PreUpdate
    protected void  onUpadare()
    {
        this.updated_At=new Date();
    }

}