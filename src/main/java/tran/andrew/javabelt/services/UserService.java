package tran.andrew.javabelt.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import tran.andrew.javabelt.models.LoginUser;
import tran.andrew.javabelt.models.User;
import tran.andrew.javabelt.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        // bcrypt takes in the original pass string then does it thing and we save teh
        // hashed
        user.setPassword(hashed);
        return userRepo.save(user);
    }

    // here we are creating the user and running the info thru bcrypt

    public User getUser(String email) {
        Optional<User> potentialUser = userRepo.findByEmail(email);
        return potentialUser.isPresent() ? potentialUser.get() : null;
    }

    public User getUser(Long id) {
        Optional<User> potentialUser = userRepo.findById(id);
        return potentialUser.isPresent() ? potentialUser.get() : null;
    }

    // here we are getting the user by email and if it is present then we get it
    // thrrough overloaded method

    public User login(LoginUser loginUser, BindingResult result) {
        if (result.hasErrors()) {
            return null;
        }
        User existingUser = this.getUser(loginUser.getEmail());
        if (existingUser == null) {
            result.rejectValue("email", "Unknown Email");
            return null;
        }
        if (!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
            result.rejectValue("email", "invalid credentials");
        }
        return existingUser;
    }

    public User findByEmail(String email) {
        return null;
    }

    public boolean authenticateUser(String email, String password) {
        return false;
    }

    public Object getId() {
        return null;
    }
}
