package com.in30minute.thinkspringboot.Service;

import com.in30minute.thinkspringboot.Model.FMCUser;
import com.in30minute.thinkspringboot.Model.Post;
import com.in30minute.thinkspringboot.Repository.FMCRepo;
import com.in30minute.thinkspringboot.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FMCServicess {

   // private final Map<Long, Product> productMap = new HashMaphMap<>();

      @Autowired
      private FMCRepo FMCRepo;
      private PostRepo postRepo;

    public void deleteId(Long id) {
        FMCRepo.deleteById(id);
    }

    public List<FMCUser> getalluser(){
        return FMCRepo.findAll();
    }

    public Optional<FMCUser> retriveById(Long id){
        return FMCRepo.findById(id);
    }

    public List<Post> retriveAllPosts()
    {
        return postRepo.findAll();
    }

}
