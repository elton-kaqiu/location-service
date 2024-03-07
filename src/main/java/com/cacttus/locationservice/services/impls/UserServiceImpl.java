package com.cacttus.locationservice.services.impls;

import com.cacttus.locationservice.entities.User;
import com.cacttus.locationservice.infrastrucutures.BaseService;
import com.cacttus.locationservice.repositories.UserRepository;
import com.cacttus.locationservice.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseService<User, Long> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
