package blogpost.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import blogpost.project.models.Post;
import blogpost.project.service.PostService;

@Controller
public class AddPostController {
	@Autowired
	PostService postService;
	
	@GetMapping("/addPost")
	public String addPost()
	{
		return "post";
	}
	
	@PostMapping("/addPost")
	public String pasteBlog(@ModelAttribute Post expost,Model model)
	{
		postService.save(expost);
		//System.out.println("Post printed="+expost);
		return "redirect:/home";
	}
	
	@GetMapping("/posts/{id}")
	public String showPost(@PathVariable Long id,Model model)
	{
		Optional<Post> op=postService.findById(id);
		//System.out.println("New Data"+op);
		if(op.isPresent())
		{
		 model.addAttribute("singlePosts",op.get());
		}
		return "viewSinglePost";	
	}

}
