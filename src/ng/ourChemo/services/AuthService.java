package ng.ourChemo.services;

public interface AuthService {
    String login(String username, String password);
    String logout(String username);
    String registerChemist(String username, String password);
}
