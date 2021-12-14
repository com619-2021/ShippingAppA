package uk.ac.solent.user;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<UserDto> getById(Integer id);
    Optional<UserDto> create(UserDto user);
    Optional<UserDto> save(UserDto user);
    Optional<List<UserDto>> getAll();
    void archive(Integer id);
    void archive(UserDto user);
}
