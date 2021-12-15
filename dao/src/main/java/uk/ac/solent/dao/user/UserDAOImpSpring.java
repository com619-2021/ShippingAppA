package uk.ac.solent.dao.user;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.user.UserDao;
import uk.ac.solent.model.user.UserDto;

import java.util.List;
import java.util.Optional;

@Component
public class UserDAOImpSpring implements UserDao {

    @Override
    public Optional<UserDto> create(UserDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<UserDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<UserDto> save(UserDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
