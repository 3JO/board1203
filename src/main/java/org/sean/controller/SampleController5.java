package org.sean.controller;

import org.sean.domain.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {
	@RequestMapping("/doJSON")
	public @ResponseBody BoardVO doJSON(){
		
				
		return null;
		
	}

}
