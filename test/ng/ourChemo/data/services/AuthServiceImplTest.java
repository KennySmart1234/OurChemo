package ng.ourChemo.data.services;

import ng.ourChemo.data.repositories.UserRepository;
import ng.ourChemo.data.repositories.UserRepositoryImpl;
import ng.ourChemo.services.AuthService;
import ng.ourChemo.services.AuthServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthServiceImplTest {
    private UserRepository users;

    @BeforeEach
    public void setUp() {
        users = new UserRepositoryImpl();
    }

    @Test
    public void registerChemist_UserCountIsOneTest() {
        AuthService authService = new AuthServiceImpl();
        String chemistOne = authService.registerChemist("Kenny", "1234");
        assertEquals(1, users.count());

    }

    @Test
    public void registerChemist_UserCountIsTwoTest() {
        AuthService authService = new AuthServiceImpl();
        String chemistOne = authService.registerChemist("Kenny", "1234");
        String chemistTwo = authService.registerChemist("Kenny", "1234");
        assertEquals(2, users.count());

    }

    @Test
    public void registerChemist_UserCountIsThreeTest() {
        AuthService authService = new AuthServiceImpl();
        String chemistOne = authService.registerChemist("Kenny", "1234");
        String chemistTwo = authService.registerChemist("Smart", "1234");
        String chemistThree = authService.registerChemist("Stephen", "1234");

        assertEquals(3, users.count());

    }



}
