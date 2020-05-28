package sdominika.ndtcertification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdominika.ndtcertification.entity.CompanyContactData;

@Repository
public interface CompanyContactDataRepository extends JpaRepository<CompanyContactData, Long> {
}
