package com.photogrid.mygrid.repositories.security;

import com.photogrid.mygrid.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
