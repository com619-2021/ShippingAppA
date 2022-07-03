package uk.ac.solent.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.solent.model.user.UserDto;
import uk.ac.solent.dao.user.UserRepository;

import java.util.Collections;

@Service
public class CUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public CUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try{
            UserDto user = this.userRepository.findByUsername(username);
            return new User(user.getUsername(), user.getPassword(), Collections.emptyList());
        }catch (Exception e){
            e.printStackTrace();
        }
    return null;
    }
}
