package net.ishari.timesync.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(@Param("username") String username);
}
