package sdominika.ndtcertification.service;


import org.springframework.stereotype.Service;
import sdominika.ndtcertification.entity.CompanyData;
import sdominika.ndtcertification.interfaces.CompanyDataService;
import sdominika.ndtcertification.repository.CompanyDataRepository;

import java.util.List;

@Service
public class CompanyDataServiceImpl implements CompanyDataService {
    private CompanyDataRepository companyDataRepository;

    public CompanyDataServiceImpl(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }
    @Override
    public void update(CompanyData companyData) {
        companyDataRepository.save(companyData);
        //this.companyDataRepository.findOneById(id);
    }


    @Override
    public List<CompanyData> showAll() {
        return this.companyDataRepository.findAll();
    }

    @Override
    public CompanyData findById(long id) {
        return this.companyDataRepository.findById(id).orElse(null);
    }

    @Override
    public CompanyData findByNIP(String nip) {
        return companyDataRepository.findOneByCompanyNIP(nip).orElse(null);
    }

    @Override
    public void saveCompany(CompanyData companyData) {
        this.companyDataRepository.save(companyData);
    }

    @Override
    public void delete(long id) {
        CompanyData companyData = findById(id);
        this.companyDataRepository.delete(companyData);
    }



}
