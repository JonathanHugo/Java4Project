package ca.sheridancollege.hugoj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.hugoj.domain.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
