package com.in30minute.thinkspringboot.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private FMCUser fmcUser;

//    public Post(int id, String description, FMCUser fmcUser) {
//        this.id = (int) id;
//        this.description = description;
//        this.fmcUser = fmcUser;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FMCUser getFmcUser() {
        return fmcUser;
    }

    public void setFmcUser(FMCUser fmcUser) {
        this.fmcUser = fmcUser;
    }

    @Override
    public String toString() {
        return "post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", fmcUser=" + fmcUser +
                '}';
    }
}
