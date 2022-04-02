package ca.sheridancollege.hugoj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.hugoj.domain.Account;
import ca.sheridancollege.hugoj.domain.User;
import ca.sheridancollege.hugoj.repositories.AccountRepository;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;

@Controller
public class GameController {

	UserRepository userRepository;
	AccountRepository accountRepository;
	GamePlayRepository gamePlayRepository;
	
	@GetMapping("/displayUsers")
	public String displayUsers(Model model) {
		
		model.addAttribute("userList", gamePlayRepository.getById(null));
		
		return "leaderboard";
	}
	
	@PostMapping("/addUserToGame")
	public String addUser(Model model, @ModelAttribute User user) {
		
		
		
		
		
		return "gamepage";
		
	}
	
	@PostMapping("/updateScoreToUser")
	public String addScore(Model model) {
		
		return "gamepage";
	}
	
	@PostMapping("/uploadUserScore")
	public String uploadUserScore(Model model) {
		
		
		return "index";
	}
	
	
}
