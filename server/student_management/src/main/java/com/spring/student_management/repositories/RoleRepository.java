package com.spring.student_management.repositories;

import com.spring.student_management.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created at 11/13/2022 by Darius
 **/
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
