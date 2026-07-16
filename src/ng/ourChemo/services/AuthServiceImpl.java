package ng.ourChemo.services;

import ng.ourChemo.data.models.User;
import ng.ourChemo.data.repositories.UserRepository;
import ng.ourChemo.data.repositories.UserRepositoryImpl;

public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository = new UserRepositoryImpl();


    @Override
    public String registerChemist(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);
        return "Register successful for chemist";
    }

    @Override
    public String login(String username, String password) {

        return "Login successful for user" + username;
    }

    @Override
    public String logout(String username) {

        return "Logout successful for user" + username;
    }

}
