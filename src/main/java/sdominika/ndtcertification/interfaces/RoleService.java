package sdominika.ndtcertification.interfaces;


import sdominika.ndtcertification.entity.Role;

public interface RoleService {
    void save(Role role);

    Role findOneByName(String admin);
}
