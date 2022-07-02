package uk.ac.solent.model.user;

import java.util.List;
import java.util.Optional;

public interface UserModelService {
    UserDto create(UserDto user);

    UserDto findByUsername(String username);

    Optional<UserDto> findByEmail(String email);

    List<UserDto> findAll();

    UserDto save(UserDto user);

//    UserDto updateUserRoles(String username, List<String> roleNames);

//    List<Role> getAvailableUserRoles();

//    List<String> getAvailableUserRoleNames();
}
