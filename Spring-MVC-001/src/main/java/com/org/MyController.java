package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("msg")
//	@ResponseBody
public String getMsg() {
	return "<html><body><h1>hiii</h1></body></html>";
	}
	
	@RequestMapping("print")
		public String printMsg() {
			return "print.jsp";
		}
	
	@RequestMapping("add")
	@ResponseBody
	public String addNums(@RequestParam int n1, @RequestParam int n2) {
		return "<html><body><h1>"+(n1+n2)+"</h1></body></html>";
	}
	
	}

