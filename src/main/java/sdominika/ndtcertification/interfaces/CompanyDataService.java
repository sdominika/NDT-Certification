package sdominika.ndtcertification.interfaces;

import sdominika.ndtcertification.entity.CompanyData;

import java.util.List;

public interface CompanyDataService {
    List<CompanyData> showAll();
    CompanyData findById(long id);
    void saveCompany(CompanyData companyData);
    void delete(long id);
    void update(CompanyData companyData);
}

