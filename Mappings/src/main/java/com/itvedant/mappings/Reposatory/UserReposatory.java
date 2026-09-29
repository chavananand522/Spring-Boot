package com.itvedant.mappings.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itvedant.mappings.entity.User1;

public interface UserReposatory extends JpaRepository<User1, Long> {

}