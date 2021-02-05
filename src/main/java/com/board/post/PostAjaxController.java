package com.board.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.post.service.PostService;

@Controller
@RequestMapping(value ="post/ajax")
public class PostAjaxController {

	@Autowired
	private PostService service;
	
	@RequestMapping(value ="/getPostList")
	@ResponseBody
	public List getPostList() {
		return service.getPostList(null);
	}
}
