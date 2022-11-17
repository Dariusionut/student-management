package com.spring.student_management.repositories;

import com.spring.student_management.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created at 11/14/2022 by Darius
 **/
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
