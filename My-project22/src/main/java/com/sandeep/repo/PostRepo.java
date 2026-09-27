package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.entities.BlogPost;

public interface PostRepo extends JpaRepository<BlogPost, Integer> {

}
