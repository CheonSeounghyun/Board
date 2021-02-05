package com.board.post.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.post.mapper.PostMapper;

@Service
public class PostService {

	@Autowired
	private PostMapper postMapper;
	
	public List getPostList(HashMap<Object, Object> vo) {
		// TODO Auto-generated method stub
		return postMapper.getPostList(vo);
	}

}
