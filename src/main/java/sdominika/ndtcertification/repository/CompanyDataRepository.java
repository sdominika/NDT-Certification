package sdominika.ndtcertification.repository;

import org.hibernate.validator.constraints.pl.NIP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sdominika.ndtcertification.entity.CompanyData;

import java.util.List;

@Repository
public interface CompanyDataRepository extends JpaRepository <CompanyData, Long> {
    void findOneById(Long id);

//    @Query("Select cd From CompanyData cd  join cd.companyContactData dt Where NIP = :nip")
//    List<CompanyData> findAllByNIP(@Param("nip") String NIP);
    List<CompanyData> findAllByCompanyNIP( String NIP);
}
