package ca.sheridancollege.hugoj.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Builder
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
