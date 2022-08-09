package com.licentaPaunescuGabriel.Springboot.project.repository;

import java.util.Optional;

import com.licentaPaunescuGabriel.Springboot.project.entity.ERole;
import com.licentaPaunescuGabriel.Springboot.project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}