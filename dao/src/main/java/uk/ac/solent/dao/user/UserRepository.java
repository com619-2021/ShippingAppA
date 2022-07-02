package uk.ac.solent.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.user.UserDto;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {
    UserDto findByUsername(String username);
    Optional<UserDto> getByEmail(String email);
}
