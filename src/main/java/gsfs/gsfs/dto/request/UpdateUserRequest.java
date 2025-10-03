package gsfs.gsfs.dto.request;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UpdateUserRequest {
    String password;
    String firstName;
    String lastName;
    LocalDate dob;
}
