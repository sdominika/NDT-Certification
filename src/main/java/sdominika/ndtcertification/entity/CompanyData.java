package sdominika.ndtcertification.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "company_data")
public class CompanyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
//    @NotNull
    @NIP
    private String companyNIP;
//    @NotNull
    private String companyName;
//    @NotNull
    private String companyAddressStreet;
//    @NotNull
    private String companyAddressPostCode;
//    @NotNull
    private String companyAddressCity;
    @OneToMany (mappedBy = "companyData")
    private Set<CompanyContactData> companyContactData = new HashSet<>();
    @OneToMany (mappedBy = "companyData")
    private Set<EmployeeData> employeeData = new HashSet<>();

}
