package sdominika.ndtcertification.interfaces;

import sdominika.ndtcertification.entity.CompanyData;

import java.util.List;

public interface CompanyDataService {
    List<CompanyData> showAll();

    public CompanyData findById(long id);

    void saveCompany(CompanyData companyData);

    void delete(long id);

    //void update(CompanyData companyData, Long id);

    void update(CompanyData companyData);
}

