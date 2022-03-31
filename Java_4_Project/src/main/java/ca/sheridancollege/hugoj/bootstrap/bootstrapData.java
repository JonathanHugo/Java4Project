package ca.sheridancollege.hugoj.bootstrap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		
		//List<GamePlay> gplist = new ArrayList<GamePlay>();
		//List<User> ulist = new ArrayList<User>();
		
		
		/* all Games */
		Game g1 = Game.builder()
				.name("Quick Draw")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		Game g2 = Game.builder()
				.name("Baseball")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		Game g3 = Game.builder()
				.name("Ping Pong")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		Game g4 = Game.builder()
				.name("Lightsaber Duel")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		
		/* user who played Ping pong */
		User u1 = User.builder()
				.username("Tim221")
				.location("Canada")
				.bday(LocalDate.of(2001, 2, 5))
				.gamePlays(new ArrayList<GamePlay>())
				.build();
		
		GamePlay gp1 = GamePlay.builder()
				.score(12) //assuming player played pong
				.scoreDate(LocalDateTime.of(2022, 2, 5,12,13))
				.build();

		u1.getGamePlays().add(gp1);
///////////////////////////////		

		/////////////////////
		Account a1  = Account.builder()
				.username("Tim221")
				.email("Tim@Gmail.com")
				.encryptedPassword("secret")
				.build();
		
		a1.setUser(u1);
		gp1.setUser(u1);
		gp1.setGame(g3);

	}
	


	
}
