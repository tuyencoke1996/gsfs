package gsfs.gsfs.repository;

import gsfs.gsfs.mapper.UserMapper;
import gsfs.gsfs.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final UserMapper userMapper;
    public UserRepository(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void save(User user) {
        userMapper.insert(user);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void delete(Long id) {
        userMapper.delete(id);
    }

    public boolean findByAdmin() {
        return userMapper.isAdminExist();
    }
}
