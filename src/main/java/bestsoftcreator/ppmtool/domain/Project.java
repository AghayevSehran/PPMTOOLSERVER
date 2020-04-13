package bestsoftcreator.ppmtool.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private String projectIdentifier;

    private String description;

    private Date sart_date;

    private Date end_date;

    private Date ceated_At;

    private Date updated_At;

    public Project()
    {

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