package blogpost.project.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogpost.project.models.Post;
import blogpost.project.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public Post save(Post post)
	{
	   /* if(post.getId()=null)
		{
			post.createdAt=LocalDateTime.now();
		}*/
		return postRepository.save(post);
	}

	public Optional<Post> findById(Long id) {
		return postRepository.findById(id);
	}

	public List<Post> findAll() {

		return postRepository.findAll();
	}
	

}
