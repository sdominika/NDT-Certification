package sdominika.ndtcertification.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sdominika.ndtcertification.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String roleName);
}