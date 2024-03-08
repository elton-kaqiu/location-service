package com.cacttus.locationservice.services.impls;

import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.infrastrucutures.services.BaseServiceImpl;
import com.cacttus.locationservice.repositories.RoleRepository;
import com.cacttus.locationservice.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {

    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
