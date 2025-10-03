package gsfs.gsfs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class User {
    Long id;
    String username;
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
