package ca.sheridancollege.hugoj.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.hugoj.domain.GamePlay;

public interface GamePlayRepository extends JpaRepository<GamePlay, Long> {
	public List<GamePlay> findAllByOrderByScore();


}
