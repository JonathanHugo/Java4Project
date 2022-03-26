package ca.sheridancollege.hugoj.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.NonNull;

public class Game {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private Long score;
	
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate scoreRecorded;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> userList;
	
}
