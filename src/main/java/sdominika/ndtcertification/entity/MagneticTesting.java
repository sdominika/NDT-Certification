package sdominika.ndtcertification.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ndt_mt")
public class MagneticTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date mt2;
    private Date mt3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
