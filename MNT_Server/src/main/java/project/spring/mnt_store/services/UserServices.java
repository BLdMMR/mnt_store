package project.spring.mnt_store.services;

import org.springframework.stereotype.Component;
import project.spring.mnt_store.repositories.UserRepository;

import java.util.List;

@Component
public class UserServices {

    private UserRepository repo;
    public UserServices(UserRepository repo) {
        this.repo = repo;
    }

    public List<String> getAllUsers() {
        return repo.getAllUsers();
    }
}
