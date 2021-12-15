package uk.ac.solent.model.user;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<UserDto> create(UserDto entity);
    Optional<UserDto> findById(Integer id);
    Optional<List<UserDto>> findAll();
    Optional<UserDto> save(UserDto entity);
    Optional<UserDto> deleteById(Integer id);
    Optional<UserDto> archiveById(Integer id);
}
