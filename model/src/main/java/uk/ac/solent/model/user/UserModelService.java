package uk.ac.solent.model.user;

import uk.ac.solent.model.base.BaseService;

import java.util.Optional;

public interface UserModelService extends BaseService<UserDto> {
    Optional<UserDto> findByEmail(String email);
}
