package ng.ourChemo.data.repositories;

import ng.ourChemo.data.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {


        private static final List<User> users = new ArrayList<>();
        private static int idCounter = 1;

        @Override
        public int count() {

            return users.size();
        }

        @Override
        public User save(User user) {
            if (user.getId() == 0) {
                user.setId(idCounter);
                idCounter++;
                users.add(user);
            } else {

                int index = users.indexOf(user);
                if (index != -1) {
                    users.set(index, user);
                } else {
                    users.add(user);
                }
            }
            return user;
        }

        @Override
        public User findById(int id) {
            User target = new User();
            target.setId(id);

            int index = users.indexOf(target);
            if (index != -1) {
                return users.get(index);
            }
            return null;
        }

        @Override
        public List<User> findAllById(int id) {
           return new ArrayList<>(users);
        }

        @Override
        public void delete(User user) {
            if (user != null) {
                users.remove(user);
            }
        }

        @Override
        public void deleteById(int id) {
            User target = new User();
            target.setId(id);
            users.remove(target);
        }

        @Override
        public boolean existsById(int id) {
            User target = new User();
            target.setId(id);
            return users.contains(target);
        }

        @Override
        public void deleteAll() {
            users.clear();
        }

}
