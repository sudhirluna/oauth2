package com.sudhir.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhir.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
