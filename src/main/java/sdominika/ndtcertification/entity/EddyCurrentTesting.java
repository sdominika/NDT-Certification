package sdominika.ndtcertification.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ndt_et")
public class EddyCurrentTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date et1;
    private Date et2;
    private Date et3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
