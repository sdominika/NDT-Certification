package sdominika.ndtcertification.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "company_contact_data")
public class CompanyContactData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String CompanyContactSurname;
    @NotNull
    private String CompanyContactName;
    @NotNull
    private String CompanyContactEmail;
    @NotNull
    private String CompanyContactPhoneNumber;
    @ManyToOne
    private CompanyData companyData;

}
