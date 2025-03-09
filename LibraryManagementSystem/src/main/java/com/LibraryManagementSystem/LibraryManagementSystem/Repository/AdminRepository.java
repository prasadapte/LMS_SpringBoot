package com.LibraryManagementSystem.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {}

