package com.in30minute.thinkspringboot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "FMC_User")
public class FMCUser {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       Long id;
       String name;
       String plant_type;


       @OneToMany(mappedBy = "fmcUser")
       @JsonIgnore
       private List<Post> post;

    public FMCUser() {
    }

    public FMCUser(Long id, String name, String plant_type) {
        this.id = id;
        this.name = name;
        this.plant_type = plant_type;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlant_type() {
        return plant_type;
    }

    public void setPlant_type(String plant_type) {
        this.plant_type = plant_type;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "FMCUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plant_type='" + plant_type + '\'' +
                '}';
    }
}
