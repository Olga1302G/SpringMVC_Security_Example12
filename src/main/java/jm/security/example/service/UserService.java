package jm.security.example.service;

import jm.security.example.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {


    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getUserByUsername(String username);


}
