package dao;

import entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marina on 27.11.2015.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
