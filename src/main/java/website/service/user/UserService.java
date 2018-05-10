package website.service.user;

import website.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findOne(int id);

}
