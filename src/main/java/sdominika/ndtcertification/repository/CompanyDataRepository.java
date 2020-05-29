package sdominika.ndtcertification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdominika.ndtcertification.entity.CompanyData;

@Repository
public interface CompanyDataRepository extends JpaRepository <CompanyData, Long> {
    void findOneById(Long id);
}
