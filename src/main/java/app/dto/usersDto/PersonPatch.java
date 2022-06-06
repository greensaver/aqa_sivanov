package app.dto.usersDto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PersonPatch {
    private String name;
    private String job;
    private String updatedAt;
}
