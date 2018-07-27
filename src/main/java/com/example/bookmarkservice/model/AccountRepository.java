package com.example.bookmarkservice.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

	public Optional<Account> findByUsername(String username);
	
}
