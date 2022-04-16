package ca.sheridancollege.hugoj.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.hugoj.domain.Account;
import ca.sheridancollege.hugoj.domain.Game;
import ca.sheridancollege.hugoj.domain.GamePlay;
import ca.sheridancollege.hugoj.domain.User;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.GameRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class GameController {

	private UserRepository userRepository;
	private GamePlayRepository gamePlayRepository;
	private GameRepository gameRepository;
	
	@GetMapping("/displayUsers/{gameId}")
	public String displayUsers(Model model, @PathVariable Long gameId) {
		Game game = gameRepository.getById(gameId);
		List<User> userList = game.getUserList();
		model.addAttribute("userList", userList);
		return "Leaderboard.html";
	}
	
	@PostMapping("/addUserToGame")
	public String addUser(Model model, @ModelAttribute Account account, @PathVariable Long gameId) {
		User user = userRepository.findUserById(account.getUserId());
		Game game = gameRepository.getById(gameId);
		game.getUserList().add(user);
		return "Gamepage.html";
		
	}
	
	@PostMapping("/uploadUserScore")
	public String uploadUserScore(Model model, @ModelAttribute Account account, @ModelAttribute GamePlay gamePlay) {
		User user = userRepository.findUserById(account.getUserId());
		user.getGamePlays().add(gamePlay);
		gamePlay.setUser(user);
		gamePlayRepository.save(gamePlay);
		return "Gamepage.html";
	}
	
	
}
