package sdominika.ndtcertification.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdominika.ndtcertification.entity.Role;
import sdominika.ndtcertification.interfaces.RoleService;
import sdominika.ndtcertification.repository.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        this.roleRepository.save(role);
    }

    @Override
    public Role findOneByName(String roleName) {
        return this.roleRepository.findOneByName(roleName);
    }

    @Override
    public List<Role> findAll() {
        return this.roleRepository.findAll(); //???
    }


}
