package ca.sheridancollege.hugoj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.hugoj.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
