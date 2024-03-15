package com.cacttus.locationservice.services.impls;

import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.infrastrucutures.exceptions.AlreadyExistException;
import com.cacttus.locationservice.infrastrucutures.services.impls.BaseServiceImpl;
import com.cacttus.locationservice.repositories.RoleRepository;
import com.cacttus.locationservice.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role add(Role item) {
        Optional<Role> role = getRepository().findByName(item.getName());
        if (role.isPresent()) {
            throw new AlreadyExistException(String.format("Role with name: '%s' already exists!", item.getName()));
        }
        return super.add(item);
    }

    private RoleRepository getRepository() {
        return (RoleRepository) repository;
    }
}
