package website.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import website.dao.UserDAO;
import website.entity.User;
import website.service.user.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    public void save(User user) {
        if(user != null) userDAO.save(user);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findOne(int id) {
        return userDAO.findOne(id);
    }



}
