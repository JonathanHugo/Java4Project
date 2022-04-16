package ca.sheridancollege.hugoj.bootstrap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.hugoj.domain.Account;
import ca.sheridancollege.hugoj.domain.Game;
import ca.sheridancollege.hugoj.domain.GamePlay;
import ca.sheridancollege.hugoj.domain.User;
import ca.sheridancollege.hugoj.repositories.AccountRepository;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.GameRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;

@Component
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
				.name("Ping Pong")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		Game g2 = Game.builder()
				.name("Baseball")
				.gamePlays(new ArrayList<GamePlay>())
				.userList(new ArrayList<User>())
				.build();
		
		
		Game g3 = Game.builder()
				.name("Quick Draw")
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

		
		Account a1  = Account.builder()
				.username("Tim221")
				.email("Tim@Gmail.com")
				.encryptedPassword("secret")
				.build();

		a1.setUser(u1);
		gp1.setUser(u1);
		gp1.setGame(g1);
		
		
		/* user who played Baseball */
		User u2 = User.builder()
				.username("Will1999")
				.location("America")
				.bday(LocalDate.of(1999, 6, 12))
				.gamePlays(new ArrayList<GamePlay>())
				.build();
		
		GamePlay gp2 = GamePlay.builder()
				.score(10) //assuming player played pong
				.scoreDate(LocalDateTime.of(2022, 3, 31,15,10))
				.build();

		u2.getGamePlays().add(gp2);

		Account a2  = Account.builder()
				.username("Will1999")
				.email("Will@Gmail.com")
				.encryptedPassword("shush221")
				.build();

		a2.setUser(u2);
		gp2.setUser(u2);
		gp2.setGame(g2);
		
		
		/* user who played Quick Draw */
		User u3 = User.builder()
				.username("cowboyfan22")
				.location("Ireland")
				.bday(LocalDate.of(2002, 7, 20))
				.gamePlays(new ArrayList<GamePlay>())
				.build();
		
		GamePlay gp3 = GamePlay.builder()
				.score(5) //assuming player played pong
				.scoreDate(LocalDateTime.of(2022, 4, 1, 13, 30))
				.build();

		u3.getGamePlays().add(gp3);

		Account a3  = Account.builder()
				.username("cowboyfan22")
				.email("Chrisorvil@Gmail.com")
				.encryptedPassword("undisclosed")
				.build();

		a3.setUser(u3);
		gp3.setUser(u3);
		gp3.setGame(g3);
		
		
		/* user who played Lightsaber Duel */
		User u4 = User.builder()
				.username("lukewalker09")
				.location("Chile")
				.bday(LocalDate.of(2002, 7, 20))
				.gamePlays(new ArrayList<GamePlay>())
				.build();
		
		GamePlay gp4 = GamePlay.builder()
				.score(5) //assuming player played pong
				.scoreDate(LocalDateTime.of(2022, 4, 1, 13, 30))
				.build();

		u4.getGamePlays().add(gp4);

		Account a4  = Account.builder()
				.username("lukewalker09")
				.email("LucasRodri@Gmail.com")
				.encryptedPassword("confidential31")
				.build();

		a4.setUser(u4);
		gp4.setUser(u4);
		gp4.setGame(g4);


	}
	


	
}
