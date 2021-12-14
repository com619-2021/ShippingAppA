package uk.ac.solent.dao.user;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.user.UserDao;
import uk.ac.solent.model.user.UserDto;

import java.util.List;
import java.util.Optional;

@Component
public class UserDAOImpSpring implements UserDao {
    @Override
    public Optional<UserDto> getById(Integer id) {
        return null;
    }

    @Override
    public Optional<UserDto> create(UserDto user) {
        return null;
    }

    @Override
    public Optional<UserDto> save(UserDto user) {
        return null;
    }

    @Override
    public Optional<List<UserDto>> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(UserDto user) {

    }
}
