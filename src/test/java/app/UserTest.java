package app;

import app.config.UsersHttpRequest;
import app.dto.usersDto.Person;
import app.dto.usersDto.User;
import app.dto.usersDto.UserDetail;
import app.dto.usersDto.UserDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

public class UserTest {
    private static UsersHttpRequest usersHttpRequest;
    private static User expectedUser;

    @BeforeAll
    public static void setUp() {
        usersHttpRequest = new UsersHttpRequest();
        expectedUser = new User(12, "Rachel", "Howell", "rachel.howell@reqres.in", "https://reqres.in/img/faces/12-image.jpg");
    }

    @Test
    public void testMapUser() {
        UserDetails detail = usersHttpRequest.getUsers()
                .then()
                .statusCode(200)
                .extract().as(UserDetails.class);
        List<User> users = detail.getData();
        User actualUser = users.stream()
                .filter(user -> user
                        .getId() == expectedUser
                        .getId()).findFirst()
                .get();

        Assertions.assertEquals(expectedUser, actualUser);
    }

    @Test
    public void testUserCount() {
        Integer expectedCount = 6;
        UserDetails detail = usersHttpRequest.getUsers()
                .then()
                .statusCode(200)
                .extract().as(UserDetails.class);
        List<User> users = detail.getData();
        Assertions.assertEquals(expectedCount, users.size());
    }

    @Test
    public void testDelayed() {
        UserDetails detail = usersHttpRequest.getDelayed()
                .then()
                .statusCode(200)
                .extract().as(UserDetails.class);
        List<User> users = detail.getData();
        User actualUser = users.stream()
                .filter(user -> user
                        .getId() == TestData.user
                        .getId()).findFirst()
                .get();

        Assertions.assertEquals(TestData.user, actualUser);
    }
}
