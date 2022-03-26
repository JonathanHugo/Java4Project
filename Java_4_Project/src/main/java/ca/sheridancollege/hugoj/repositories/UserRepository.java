package ca.sheridancollege.hugoj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.hugoj.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
