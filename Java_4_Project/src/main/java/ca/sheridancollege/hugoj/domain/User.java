package ca.sheridancollege.hugoj.domain;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.NonNull;

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String username;
	@NonNull
	private String location;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate bday;

	
}
