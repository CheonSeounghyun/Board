package com.board.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import com.board.login.vo.UserVO;

@Repository
@Mapper
public interface LoginMapper {

	UserVO getMemberInfoByName(String username);

}
