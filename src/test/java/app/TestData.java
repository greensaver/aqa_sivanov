package app;

import app.dto.usersDto.Registration;
import app.dto.usersDto.Support;
import app.dto.usersDto.User;

public interface TestData {
    Integer id = 2;
    String jobTitle = "leader";
    String jobMatrix = "zion resident";
    String userNameMatrix = "morpheus";
    String userName = "Janet";
    String userLastName = "Weaver";
    String userEmail = "janet.weaver@reqres.in";
    String userAvatar = "https://reqres.in/img/faces/2-image.jpg";
    User user = new User(2, userName, userLastName, userEmail, userAvatar);
    Support support = new Support("https://reqres.in/#support-heading","To keep ReqRes free, contributions towards server costs are appreciated!");
    Registration registration = new Registration("eve.holt@reqres.in", "pistol");
}
