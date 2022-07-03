package uk.ac.solent.service.user;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.user.UserDto;
import uk.ac.solent.model.user.UserModelService;
import uk.ac.solent.dao.user.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserModelService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDto create(UserDto user) {
       user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(new HashSet<>(roleRepository.findByName(UserRoles.ROLE_USER.toString())));
        return userRepository.save(user);
    }

    @Override
    public UserDto findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto save(UserDto user) {
        return userRepository.save(user);
    }

}
