package com.board.post.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {

	List getPostList(HashMap<Object, Object> vo);

}
