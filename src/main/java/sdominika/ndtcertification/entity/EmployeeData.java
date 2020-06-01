package sdominika.ndtcertification.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employee_data")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String employeeSurname;
    @NotNull
    private String employeeName;
    @NotNull
    private String employeeDateOfBirth;
    @NotNull
    private String employeePlaceOfBirth;
    @NotNull
    private String employeeCertificateOfVision;
    @ManyToOne
    private CompanyData companyData;
    @ManyToMany
    private Set<VisualTesting> visualTestings = new HashSet<>();
    @ManyToMany
    private Set<MagneticTesting> magneticTestings = new HashSet<>();
    @ManyToMany
    private Set<PenetrantTesting> penetrantTestings = new HashSet<>();
    @ManyToMany
    private Set<UltrasonicTesting> ultrasonicTestings = new HashSet<>();
    @ManyToMany
    private Set<RadiographicTesting> radiographicTestings = new HashSet<>();
    @ManyToMany
    private Set<EddyCurrentTesting> eddyCurrentTestings = new HashSet<>();
}
