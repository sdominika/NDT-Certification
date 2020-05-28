package sdominika.ndtcertification.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ndt_rt")
public class RadiographicTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date rt1;
    private Date rt2;
    private Date rt3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
