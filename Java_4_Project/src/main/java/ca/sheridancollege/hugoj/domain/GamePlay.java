package ca.sheridancollege.hugoj.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GamePlay {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	User user;
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	Game game;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime scoreDate;
	private int score;

}
