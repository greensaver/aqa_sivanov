package app;

import app.config.UsersHttpRequest;
import app.dto.usersDto.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserDetailsTest {
    private static UsersHttpRequest usersHttpRequest;

    @BeforeAll
    public static void setUsersHttpRequest(){
        usersHttpRequest = new UsersHttpRequest();
    }

    @Test
    public void testGetUserDetail(){
        UserDetail expectedDetail = new UserDetail(TestData.user, TestData.support);
        UserDetail actual = usersHttpRequest.getUser(Integer.toString(TestData.id))
                .then()
                .extract()
                .as(UserDetail.class);
        Assertions.assertEquals(expectedDetail, actual);
    }

    @Test
    public void createUser(){
        Person expected = new Person(TestData.userName, TestData.jobTitle,"7", "2022-06-04T13:45:03.761Z");
        Person actual = usersHttpRequest.createUser(expected)
                .then()
                .extract()
                .as(Person.class);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUserNotFound() {
       usersHttpRequest.getUserNotFound()
                .then()
                .statusCode(404);
    }

    @Test
    public void testUserUpdate(){
        PersonUpdate expected = new PersonUpdate(TestData.userNameMatrix, TestData.jobMatrix, "2022-06-05T10");
        PersonUpdate actual = usersHttpRequest.getUpdate(expected)
                .then()
                .statusCode(200)
                .extract()
                .as(PersonUpdate.class);
        assertThat(expected.getName()).isEqualTo(actual.getName());
        assertThat(expected.getJob()).isEqualTo(actual.getJob());
    }

    @Test
    public void testUserPatch(){
        PersonPatch expected = new PersonPatch(TestData.userNameMatrix, TestData.jobMatrix, "2022-06-05T10");
        PersonPatch actual = usersHttpRequest.getPatch(expected)
                .then()
                .statusCode(200)
                .extract()
                .as(PersonPatch.class);
        assertThat(expected.getName()).isEqualTo(actual.getName());
        assertThat(expected.getJob()).isEqualTo(actual.getJob());

    }

    @Test
    public void testUserDelete() {
       usersHttpRequest.getUserDelete(Integer.toString(TestData.id))
                .then()
                .statusCode(204);
    }

    @Test
    public void testRegistrationSuccses(){
        RegistrationResponse expected = new RegistrationResponse(4,"QpwL5tke4Pnpja7X4");
        RegistrationResponse actual = usersHttpRequest.registerSuccessful(TestData.registration)
                .then()
                .extract()
                .as(RegistrationResponse.class);
        assertThat(expected.getId()).isEqualTo(actual.getId());
        assertThat(expected.getToken()).isEqualTo(actual.getToken());
    }

    @Test
    public void testRegistrationUnsuccessful(){
        Registration registration = new Registration();
        registration.setEmail("sydney@fife");
        RegistrationErrorResponse expected = new RegistrationErrorResponse("Missing password");
        RegistrationErrorResponse actual = usersHttpRequest.registerUnsuccessful(registration)
                .then()
                .statusCode(400)
                .extract()
                .as(RegistrationErrorResponse.class);
        Assertions.assertEquals(expected, actual);
    }




}
