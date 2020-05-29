package sdominika.ndtcertification.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ndt_vt")
public class VisualTesting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date vt2;
    private Date vt3;
    @ManyToMany
    private Set<EmployeeData> employeeData = new HashSet<>();
}
