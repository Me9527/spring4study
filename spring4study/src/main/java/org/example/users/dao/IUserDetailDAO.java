package org.example.users.dao;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserDetailDAO {
	List<UserDetails> loadUsersByUsername(String username);
	List<GrantedAuthority> loadUserAuthorities(String username);
	
	//List<GrantedAuthority> loadGroupAuthorities(String username);
	
	
}
