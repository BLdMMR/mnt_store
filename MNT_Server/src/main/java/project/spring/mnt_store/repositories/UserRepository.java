package project.spring.mnt_store.repositories;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private ArrayList<String> temp_repo = new ArrayList();

    public List<String> getAllUsers() {
        return List.copyOf(temp_repo);
    }

}
