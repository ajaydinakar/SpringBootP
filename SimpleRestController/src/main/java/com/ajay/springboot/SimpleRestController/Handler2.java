package com.ajay.springboot.SimpleRestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
class Handler2 {
	@RequestMapping("/one")
	public  String map3()
	{
		return "main";
	}

}
