package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.user.UserRepository;
import uk.ac.solent.model.booking.BookingDto;
import uk.ac.solent.model.user.UserDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/user", produces = "application/json")
@Transactional
public class UserController implements BaseController<UserDto>{

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @PostMapping(value ="/api/user")
    public UserDto create(UserDto entity) {
        return null;
    }

    @Override
    @PatchMapping(value ="/api/user/{id}")
    public UserDto save(@PathVariable( "id" ) Integer id, UserDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/user/{id}")
    public UserDto findById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @GetMapping(value = "/api/user")
    public List<UserDto> findAll() {
        return Collections.emptyList();
    }

    @Override
    @DeleteMapping(value ="/api/user/{id}")
    public UserDto deleteById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @PutMapping(value ="/api/user/{id}")
    public UserDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
