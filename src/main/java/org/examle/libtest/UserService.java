package org.examle.libtest;

import org.examle.libtest.entity.User;
import org.examle.libtest.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Creating a User
    public User createUser(User user) {return userRepository.save(user);}

    // Reading Users
    public List<User> getAllUsers() {return userRepository.findAll();}
    public User getUserById(Long id) {return userRepository.findById(id).orElse(null);}

    // Updating a User
    public User updateUser(User updateUser) {return userRepository.save(updateUser);}

    // Deleting a User
    public void deleteUser(Long id) {userRepository.deleteById(id);}
}
