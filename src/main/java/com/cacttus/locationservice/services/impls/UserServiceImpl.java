package com.cacttus.locationservice.services.impls;

import com.cacttus.locationservice.entities.User;
import com.cacttus.locationservice.infrastrucutures.data.DaoRepository;
import com.cacttus.locationservice.infrastrucutures.data.DbDao;
import com.cacttus.locationservice.infrastrucutures.services.impls.BaseServiceImpl;
import com.cacttus.locationservice.repositories.UserRepository;
import com.cacttus.locationservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service


public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    private final DbDao dbDao;

    public UserServiceImpl(UserRepository repository, DbDao dbDao) {
        super(repository);
        this.dbDao = dbDao;
    }

    @Override
    public List<User> findByCountLocationGreaterThan(int count) {
        String procedureName = "sp_get_user_by_count_location";
        HashMap<String, Object> inParams = new HashMap<>();
        inParams.put("count", count);
        return dbDao.getResultFromProcedure(procedureName, inParams, null, User.class);
    }
}
