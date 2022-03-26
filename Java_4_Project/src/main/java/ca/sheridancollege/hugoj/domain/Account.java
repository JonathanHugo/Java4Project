package ca.sheridancollege.hugoj.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.NonNull;

public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	@NonNull
	private String username;
	@NonNull
	private String email;
	@NonNull
	private String encryptedPassword;
	
	@OneToOne
	@JoinTable(name="ACCOUNT_USER", joinColumns = @JoinColumn(name="ACCOUNT_ID"), inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private User user;
}
