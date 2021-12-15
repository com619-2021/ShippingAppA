package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.user.UserRepository;
import uk.ac.solent.model.booking.BookingDto;
import uk.ac.solent.model.user.UserDto;

import java.util.List;
import java.util.Optional;

@RestController
@Transactional
public class UserController implements BaseController<UserDto>{

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @PostMapping("")
    public Optional<UserDto> create(UserDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<UserDto> save(@PathVariable( "id" ) Integer id, UserDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<UserDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<UserDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<UserDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<UserDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
