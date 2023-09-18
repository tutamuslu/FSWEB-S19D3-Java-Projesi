package com.workintech.security.secureApp.repository;

import com.workintech.security.secureApp.entity.Role;
import com.workintech.security.secureApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT r FROM Student r WHERE r.tckn = :tckn")
    Optional<Student> findByAuthority(String tckn);

}