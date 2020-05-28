package sdominika.ndtcertification.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ndt_pt")
public class PenetrantTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date pt2;
    private Date pt3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
