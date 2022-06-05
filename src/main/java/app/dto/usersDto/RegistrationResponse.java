package app.dto.usersDto;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationResponse {
    private Integer id;
    private String token;
}
