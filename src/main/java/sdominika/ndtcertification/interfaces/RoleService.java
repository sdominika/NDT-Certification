package sdominika.ndtcertification.interfaces;


import sdominika.ndtcertification.entity.Role;

import java.util.List;

public interface RoleService {
    void save(Role role);

    Role findOneByName(String admin);

    List<Role> findAll();
}
