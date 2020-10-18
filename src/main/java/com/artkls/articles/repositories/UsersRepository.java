package com.artkls.articles.repositories;


import com.artkls.articles.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UsersRepository extends CrudRepository<User, Long> { ;
    Optional<User> findByUsername(String username);
    List<User> findAllByUsername(String username);
    List<User> findAllByPassword(String password);
    User findByUsernameAndPassword(String username, String password);
}
