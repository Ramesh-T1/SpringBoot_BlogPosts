package blogpost.project.config;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import blogpost.project.models.Post;
import blogpost.project.service.PostService;

@Component
public class SeedData implements CommandLineRunner {
	@Autowired
	private PostService postService;

	@Override
	public void run(String... args) throws Exception {
		List<Post> p = postService.findAll();
		if (p.size() == 0) {
			Post dummy1 = new Post();
			dummy1.setTitle("Post 01");
			dummy1.setBody("Facebook is interesting");
			postService.save(dummy1);

			Post dummy2 = new Post();
			dummy2.setTitle("Post 02");
			dummy2.setBody("Gmail is master of everything");
			postService.save(dummy2);			
		}

	}

}
