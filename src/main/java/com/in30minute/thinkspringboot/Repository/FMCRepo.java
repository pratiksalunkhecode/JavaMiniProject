package com.in30minute.thinkspringboot.Repository;

import com.in30minute.thinkspringboot.Model.FMCUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FMCRepo extends JpaRepository<FMCUser, Long> {

}
