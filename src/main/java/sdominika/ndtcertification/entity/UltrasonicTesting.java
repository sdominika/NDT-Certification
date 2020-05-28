package sdominika.ndtcertification.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ndt_ut")
public class UltrasonicTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date ut1;
    private Date ut2;
    private Date ut3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
