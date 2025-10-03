package gsfs.gsfs.mapper;

import gsfs.gsfs.model.User;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // Insert user
    @Insert("INSERT INTO users(username, password, first_name, last_name, dob) " +
            "VALUES(#{username}, #{password}, #{firstName}, #{lastName}, #{dob})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    // Select all users
    @Select("SELECT id, username, password, first_name AS firstName, last_name AS lastName, dob, created_at AS createdAt, updated_at AS updatedAt FROM users")
    List<User> findAll();

    // Select user by ID
    @Select("SELECT id, username, password, first_name AS firstName, last_name AS lastName, dob, created_at AS createdAt, updated_at AS updatedAt " +
            "FROM users WHERE id = #{id}")
    User findById(Long id);

    // Update user
    @Update("UPDATE users SET username=#{username}, password=#{password}, first_name=#{firstName}, last_name=#{lastName}, dob=#{dob} WHERE id=#{id}")
    void update(User user);

    // Delete user
    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(Long id);

    // Check admin is exist
    @Select("SELECT COUNT(*) > 0 FROM users WHERE username = 'admin'")
    boolean isAdminExist();
}
