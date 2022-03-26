package ca.sheridancollege.hugoj.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.NonNull;

public class Game {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private Long score;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> usersList;
	
}
