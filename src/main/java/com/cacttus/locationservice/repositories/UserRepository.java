package com.cacttus.locationservice.repositories;

import com.cacttus.locationservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    //    @Query("SELECT u FROM users u WHERE u.email=?1 OR u.username=?1")
    @Query(value = "SELECT * FROM users AS u WHERE u.email=:emailOrUsername OR u.username=emailOrUsername", nativeQuery = true)
    Optional<User> findByEmailOrUsername(String emailOrUsername);
}
