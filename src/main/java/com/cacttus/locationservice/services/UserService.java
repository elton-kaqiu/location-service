package com.cacttus.locationservice.services;

import com.cacttus.locationservice.entities.User;
import com.cacttus.locationservice.infrastrucutures.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService extends BaseService<User, Long> {
    List<User> findByCountLocationGreaterThan(int count);
}
