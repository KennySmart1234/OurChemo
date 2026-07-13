package ng.ourChemo.data.repositories;

import org.junit.jupiter.api.Test;

import ng.ourChemo.data.repositories.UserRepository;
import ng.ourChemo.data.repositories.UserRepositoryImpl;

public class UserRepositoryTest {
    @Test
    public void newRepositryShouldBeEmptyTest() {
        UserRepository userRepository = new UserRepositoryImpl();
        assert userRepository.count() == 0;
    }

    @Test
    public void testIHaveARepository_IaddaUser_ItIsNotEmpty() {
        UserRepository userRepository = new UserRepositoryImpl();
        assert userRepository.count() == 0;
        userRepository.save(new ng.ourChemo.data.models.User());
        assert userRepository.count() == 1;
    }

    @Test
    public void testIHaveARepository_IaddaUser_ItIsNotEmpty_IaddaAnotherUser_ItIsNotEmpty() {
        UserRepository userRepository = new UserRepositoryImpl();
        assert userRepository.count() == 0;
        userRepository.save(new ng.ourChemo.data.models.User());
        assert userRepository.count() == 1;
        userRepository.save(new ng.ourChemo.data.models.User());
        assert userRepository.count() == 2;
    }

    @Test
    public void findByIdReturnsNullWhenUserNotFound() {
        UserRepository userRepository = new UserRepositoryImpl();
        assert userRepository.findById(1) == null;
    }

//    @Test
//    public void findByIdReturnsUserWhenFound() {
//        UserRepository userRepository = new UserRepositoryImpl();
//        ng.ourChemo.data.models.User user = new ng.ourChemo.data.models.User();
//        userRepository.save(user);
//        assert userRepository.findById(user.getId()) != null;
//    }
}