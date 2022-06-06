package app.dto.usersDto;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class UserDetails {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<User> data;
    private Support support;
}

