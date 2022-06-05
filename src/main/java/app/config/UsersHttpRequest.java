package app.config;

import app.dto.usersDto.*;
import io.restassured.response.Response;

public class UsersHttpRequest extends BaseHttpRequest {
    private static final String userUrl = "api/users";
    private static final String userUrlRegistration = "api/register";

    public Response getUser(String id) {
        return getRequestSpecification()
                .when()
                .get(userUrl + "/" + id);
    }

    public Response getUsers() {
        return getRequestSpecification()
                .when()
                .get(userUrl + "?page=2");
    }

    public Response createUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .post(userUrl);
    }

    public Response getUserNotFound() {
        return getRequestSpecification()
                .when()
                .get(userUrl + "/23");
    }

    public Response getUpdate(PersonUpdate personUpdate) {
        return getRequestSpecification()
                .when()
                .body(personUpdate)
                .put(userUrl + "/2");
    }

    public Response getPatch(PersonPatch personPatch) {
        return getRequestSpecification()
                .when()
                .body(personPatch)
                .patch(userUrl + "/2");
    }

    public Response getUserDelete(String id) {
        return getRequestSpecification()
                .when()
                .delete(userUrl + "/" + id);
    }

    public Response registerSuccessful(Registration registration) {
        return getRequestSpecification()
                .when()
                .body(registration)
                .post(userUrlRegistration);
    }

    public Response registerUnsuccessful(Registration registration) {
        return getRequestSpecification()
                .when()
                .body(registration)
                .post(userUrlRegistration);
    }

    public Response getDelayed() {
        return getRequestSpecification()
                .when()
                .get(userUrl + "?delay=3");
    }

}
