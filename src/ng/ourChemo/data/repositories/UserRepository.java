package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.User;
import java.util.List;

public interface UserRepository {
    long count();

    User save(User user);

    User findById(Long id);

    List<User> findAllById(Long id);

    void delete(User user);

    void deleteById(Long id);

    boolean existsById(Long id);

    void deleteAll();
}
