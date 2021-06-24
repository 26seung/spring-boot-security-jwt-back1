package com.test.login.repository;

import com.test.login.model.ERole;
import com.test.login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role , Long> {
    Optional<Role> findByName(ERole name);
}
