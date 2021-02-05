package com.board.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.board.login.mapper.LoginMapper;
import com.board.login.vo.UserVO;

@Service
public class LoginService implements UserDetailsService {
	
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserVO userVO = loginMapper.getMemberInfoByName(username);
		//userVO.setUser_id(userVO.getUser_id());
		//userVO.setUser_name(userVO.getUser_name());
		
		return User.builder()
				.username(userVO.getUser_id())
				.password(userVO.getUser_pw()).roles("ADMIN").build();
	}

}
