package ca.sheridancollege.hugoj.controllers;

import org.springframework.stereotype.Controller;

import ca.sheridancollege.hugoj.repositories.AccountRepository;
import ca.sheridancollege.hugoj.repositories.GamePlayRepository;
import ca.sheridancollege.hugoj.repositories.UserRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class GamePlayController {
	
	private UserRepository userRepository;
	private AccountRepository accountRepository;
	private GamePlayRepository gamePlayRepository;

}
