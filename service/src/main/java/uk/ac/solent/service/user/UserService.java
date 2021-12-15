package uk.ac.solent.service.user;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.user.UserDto;
import uk.ac.solent.model.user.UserModelService;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserModelService {

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

    @Override
    public Optional<UserDto> findByEmail(String email) {
        return Optional.empty();
    }
}
