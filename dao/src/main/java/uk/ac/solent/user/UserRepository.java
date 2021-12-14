package uk.ac.solent.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {
    Optional<UserDto> getByEmail(String email);
}
