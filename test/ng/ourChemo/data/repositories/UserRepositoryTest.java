
package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    public class UserRepositoryTest {

        private UserRepository userRepository;

        @BeforeEach
        void setUp() {
            userRepository = new UserRepositoryImpl();
        }

        @Test
        void newRepositoryShouldBeEmptyTest() {
            assertEquals(0, userRepository.count());
        }

        @Test
        void saveOneUser_countShouldBeOneTest() {
            User user = new User();

            userRepository.save(user);

            assertEquals(1, userRepository.count());
        }

        @Test
        void saveTwoUsers_countShouldBeTwoTest() {
            userRepository.save(new User());
            userRepository.save(new User());

            assertEquals(2, userRepository.count());
        }

        @Test
        void saveUser_userShouldHaveGeneratedIdTest() {
            User user = new User();

            userRepository.save(user);

            assertEquals(1, user.getId());
        }

        @Test
        void findByIdWhenRepositoryIsEmpty_returnsNullTest() {
            assertNull(userRepository.findById(1));
        }


        @Test
        void existsByIdWhenUserDoesNotExist_returnsFalseTest() {
            assertFalse(userRepository.existsById(1));
        }

        @Test
        void deleteUser_countShouldDecreaseTest() {
            User user = new User();

            userRepository.save(user);

            assertEquals(1, userRepository.count());

            userRepository.delete(user);

            assertEquals(0, userRepository.count());
        }


        @Test
        void deleteAll_shouldRemoveAllUsersTest() {
            userRepository.save(new User());
            userRepository.save(new User());
            userRepository.save(new User());

            assertEquals(3, userRepository.count());

            userRepository.deleteAll();

            assertEquals(0, userRepository.count());
        }

        @Test
        void findAllById_shouldReturnAllUsersInRepositoryTest() {
            userRepository.save(new User());
            userRepository.save(new User());

            List<User> users = userRepository.findAllById(1);

            assertNotNull(users);
            assertEquals(2, users.size());
        }
    }



