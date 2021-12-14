package uk.ac.solent.security;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.solent.user.UserDto;
import uk.ac.solent.user.UserRepository;

import java.util.Collections;

@Service
@AllArgsConstructor
public class CUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDto user = this.userRepository.getByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return new User(user.getEmail(), user.getPassword(), Collections.emptyList());
    }
}
