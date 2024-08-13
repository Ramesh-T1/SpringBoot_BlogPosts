package blogpost.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import blogpost.project.models.Account;
import blogpost.project.models.Post;
import blogpost.project.service.AccountService;
import blogpost.project.service.PostService;

@Controller
public class HomeController {
	@Autowired
	PostService postService;
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/home")
	public String home(Model model)
	{
		List<Post> pd=postService.findAll();
		//System.out.println(pd);
		model.addAttribute("Posts",pd);
		return "home";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@PostMapping("/addAccount")
	public String addAccount(@ModelAttribute Account acc)
	{
		accountService.saveAccount(acc);
		return "redirect:/home";
		
	}

}
