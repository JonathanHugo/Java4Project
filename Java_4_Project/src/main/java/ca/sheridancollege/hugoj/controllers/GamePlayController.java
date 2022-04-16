package ca.sheridancollege.hugoj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.GameRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class GamePlayController {
	
	private UserRepository userRepository;
	private GameRepository gameRepository;
	private GamePlayRepository gamePlayRepository;
	
	@GetMapping("/LeaderBoard")
	public String showLeaderBoard(Model model) {
		model.addAttribute("scoreList", gamePlayRepository.findAllByOrderByScore());
		model.addAttribute("userList", userRepository.findAll());
		model.addAttribute("gameList",gameRepository.findAll());
		return "LeaderBoard";
	}
	
	
	
	

}
