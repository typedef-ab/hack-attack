package se.typedef.hackattack.ui;

import com.google.common.collect.ImmutableSet;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserRepository implements UserDetailsService {

  @Override
  public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
    if ("user".equals(username)) {
      return new User(username, "password", ImmutableSet.of(() -> "ROLE_USER"));
    } else {
      throw new UsernameNotFoundException("Username " + username + "not found");
    }
  }
}
