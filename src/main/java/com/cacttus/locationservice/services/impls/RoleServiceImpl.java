package com.cacttus.locationservice.services.impls;

import com.cacttus.locationservice.entities.Role;
import com.cacttus.locationservice.infrastrucutures.BaseService;
import com.cacttus.locationservice.repositories.RoleRepository;
import com.cacttus.locationservice.services.RoleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends BaseService<Role, Integer> implements RoleService {

    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}
