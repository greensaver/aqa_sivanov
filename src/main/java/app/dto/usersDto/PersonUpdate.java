package app.dto.usersDto;

import lombok.*;

import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PersonUpdate {
    private String name;
    private String job;
    private String updatedAt;
}
