package ca.sheridancollege.hugoj.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import ca.sheridancollege.hugoj.domain.Account;
import ca.sheridancollege.hugoj.domain.Game;
import ca.sheridancollege.hugoj.domain.GamePlay;
import ca.sheridancollege.hugoj.domain.User;
import ca.sheridancollege.hugoj.repositories.AccountRepository;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.GameRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;

public class bootstrapData implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private GamePlayRepository gamePlayRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//GamePlay gp1 = new GamePlay (u1, g1, LocalDate.of(2022, 2, 5), 5);
		
		User u1 = new User ("Tom221", "Canada", LocalDate.of(2002, 5, 5), gp1);
		
		Game g1 = new Game ("QuickDraw", gp1, u1);
		
		GamePlay gp1 = new GamePlay (u1, g1, LocalDate.of(2022, 2, 5), 5);
		
		Account a1 = new Account ("Tom221","tomgulligan@gmail.com", "secret", u1 )

	}
	


	
}
