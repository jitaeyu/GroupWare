package com.groupware.company.repository;

import com.groupware.company.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

//    User findByUsername(String username);
}
