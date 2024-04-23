package com.in30minute.thinkspringboot.MyController;

import com.in30minute.thinkspringboot.Model.FMCUser;
import com.in30minute.thinkspringboot.Model.Post;
import com.in30minute.thinkspringboot.Repository.FMCRepo;
import com.in30minute.thinkspringboot.Repository.PostRepo;
import com.in30minute.thinkspringboot.Service.FMCServicess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
public class FMCController {

//    @Autowired
//    private FMCRepo FMCRepo;



    private final FMCServicess FMCServicess;
    private  final PostRepo postRepo;

    @Autowired
    public FMCController(FMCServicess productService,  PostRepo postRepo) {
        this.FMCServicess = productService;
        this.postRepo = postRepo;
    }

    @DeleteMapping("/user/{id}")
    public String deleteId(@PathVariable Long id) {

        FMCServicess.deleteId(id);
//        if (id <= 0){
//        return "the id is already deleted";
//        }else{
            return "Product deleted successfully";
//        }


    }

    @GetMapping("/user")
    public List<FMCUser> retriveallUser(){
        return FMCServicess.getalluser();
    }

    @GetMapping("/user/{id}")
    public Optional<FMCUser> getByid(@PathVariable Long id){
        return FMCServicess.retriveById(id);
    }


//    @DeleteMapping("/user/{id}")
//    public List<FMCUser> deleteId(@PathVariable Long id) {
//        FMCRepo.deleteById(id);
//        return (List<FMCUser>) ResponseEntity.ok("The deleted employee '" + id + "' deleted successfully.");
//    }

  @GetMapping("/user/{id}/posts")
  public List<Post> GetPosts(@PathVariable Long id) throws UserPrincipalNotFoundException {
        Optional<FMCUser> user = FMCServicess.retriveById(id);
        if (user.isEmpty())
            throw new UserPrincipalNotFoundException("id:"+id);
           return user.get().getPost();
  }
















}
