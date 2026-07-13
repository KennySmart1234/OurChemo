package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {


        private final List<User> database = new ArrayList<>();
        private long idCounter = 1;

        @Override
        public long count() {
            return database.size();
        }

        @Override
        public User save(User user) {
            if (user.getId() == 0) {
                user.setId(idCounter);
                idCounter++;
                database.add(user);
            } else {

                int index = database.indexOf(user);
                if (index != -1) {
                    database.set(index, user);
                } else {
                    database.add(user);
                }
            }
            return user;
        }

        @Override
        public User findById(Long id) {
            User target = new User();
            target.setId(id);

            int index = database.indexOf(target);
            if (index != -1) {
                return database.get(index);
            }
            return null;
        }

        @Override
        public List<User> findAllById(Long id) {
           return new ArrayList<>(database);
        }

        @Override
        public void delete(User user) {
            if (user != null) {
                database.remove(user);
            }
        }

        @Override
        public void deleteById(Long id) {
            User target = new User();
            target.setId(id);
            database.remove(target);
        }

}
