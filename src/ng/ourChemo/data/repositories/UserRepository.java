package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.User;
import java.util.List;

public interface UserRepository {
    int count();

    User save(User user);

    User findById(int id);

    List<User> findAllById(int id);

    void delete(User user);

    void deleteById(int id);

    boolean existsById(int id);

    void deleteAll();
}
