package com.sandeep.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.BlogPost;
import com.sandeep.repo.PostRepo;
import com.sandeep.service.PostService;
@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostRepo repo;
	@Override
	public void savePost() {
		
		BlogPost obj=new BlogPost();
		obj.setPcontent("python ");
		obj.setTitle("python Book");
		repo.save(obj);
		
	}
	@Override
	public void updatePost(Integer id) {
		Optional<BlogPost> post=repo.findById(id);
		
		if(post.isPresent()) {
			BlogPost bp=post.get();
			
			bp.setTitle("lava ");
			repo.save(bp);
		}
		
	}
	
	
	
	

}
