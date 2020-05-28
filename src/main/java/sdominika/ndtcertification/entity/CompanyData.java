package sdominika.ndtcertification.entity;


import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "company_data")
public class CompanyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @NotNull
    @NIP
    private String companyNIP;
    @NotNull
    private String companyName;
    @NotNull
    private String companyAddressStreet;
    @NotNull
    private String companyAddressPostCode;
    @NotNull
    private String companyAddressCity;
    @OneToMany (mappedBy = "companyData")
    private Set<CompanyContactData> companyContactData = new HashSet<>();
    @OneToMany (mappedBy = "companyData")
    private Set<EmployeeData> employeeData = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public void setCompanyNIP(String companyNIP) {
        this.companyNIP = companyNIP;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddressStreet() {
        return companyAddressStreet;
    }

    public void setCompanyAddressStreet(String companyAddressStreet) {
        this.companyAddressStreet = companyAddressStreet;
    }

    public String getCompanyAddressPostCode() {
        return companyAddressPostCode;
    }

    public void setCompanyAddressPostCode(String companyAddressPostCode) {
        this.companyAddressPostCode = companyAddressPostCode;
    }

    public String getCompanyAddressCity() {
        return companyAddressCity;
    }

    public void setCompanyAddressCity(String companyAddressCity) {
        this.companyAddressCity = companyAddressCity;
    }

    public Set<CompanyContactData> getCompanyContactData() {
        return companyContactData;
    }

    public void setCompanyContactData(Set<CompanyContactData> companyContactData) {
        this.companyContactData = companyContactData;
    }

    public Set<EmployeeData> getEmployeeData() {
        return employeeData;
    }

    public void setEmployeeData(Set<EmployeeData> employeeData) {
        this.employeeData = employeeData;
    }

    @Override
    public String toString() {
        return "CompanyData{" +
                "id=" + id +
                ", companyNIP='" + companyNIP + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAddressStreet='" + companyAddressStreet + '\'' +
                ", companyAddressPostCode='" + companyAddressPostCode + '\'' +
                ", companyAddressCity='" + companyAddressCity + '\'' +
                ", companyContactData=" + companyContactData +
                ", employeeData=" + employeeData +
                '}';
    }
}
