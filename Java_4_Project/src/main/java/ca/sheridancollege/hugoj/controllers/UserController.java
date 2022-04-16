package ca.sheridancollege.hugoj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.hugoj.domain.Account;
import ca.sheridancollege.hugoj.domain.GamePlay;
import ca.sheridancollege.hugoj.domain.User;
import ca.sheridancollege.hugoj.repositories.AccountRepository;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.GameRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;
import lombok.AllArgsConstructor;


@Controller
@AllArgsConstructor
public class UserController {
	
	private UserRepository userRepository;
	private AccountRepository accountRepository;
	private GamePlayRepository gamePlayRepository;
	private GameRepository gameRepository;
	
	@GetMapping("/")
	public String homePage(Model model) {
		//model.addAttribute("gameList", gameRepository.findAll());
		return "Homepage";
	}
	
	@PostMapping("/addUserToAccount")
	public String addUser(Model model,@ModelAttribute User user) {
		
		User u = userRepository.save(user);
		Account a = new Account();
		a.setUser(u);
		return "User";
	}
	
	@PostMapping("/addUserWithGamePlays")
	public String addUserWithGamePlays(Model model,@RequestParam String idForUser,@ModelAttribute GamePlay gamePlay) {

		GamePlay g = gamePlayRepository.save(gamePlay);
		User u = userRepository.findUserById(Long.parseLong(idForUser));
		u.getGamePlays().add(g);
		userRepository.save(u);
		return "User";
	}
	
	@GetMapping("/displayUser")
	public String displayUser(Model model,@ModelAttribute User user) {
		
		userRepository.findAll();
		return "User";
	}

}
