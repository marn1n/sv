package website.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import website.entity.User;

public interface UserDAO extends JpaRepository<User, Integer> {
}
