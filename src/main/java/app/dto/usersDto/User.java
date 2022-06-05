package app.dto.usersDto;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
        private Integer id;
        private String first_name;
        private String last_name;
        private String email;
        private String avatar;
}
