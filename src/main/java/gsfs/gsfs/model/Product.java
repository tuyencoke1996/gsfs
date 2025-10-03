package gsfs.gsfs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Product {
    Long id;
    String name;
    BigDecimal price;
    String description;
    Integer amount;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
