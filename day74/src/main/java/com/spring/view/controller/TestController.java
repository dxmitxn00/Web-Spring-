package com.spring.view.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value="/test.do", method=RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam("count")int count, @RequestParam("apple")int apple, @RequestParam("banana")String banana) {
		System.out.println("count : "+count);
		System.out.println("apple : "+apple);
		System.out.println("banana : "+banana);
		
		count++;
		return String.valueOf(count);
	}

	// 파라미터를 줄이는 방법
	@RequestMapping(value="/test02.do", method=RequestMethod.POST)
	@ResponseBody
	public String test02(@RequestParam Map<String,Object> map) {
		System.out.println("count : "+map.get("count"));
		System.out.println("apple : "+map.get("apple"));
		System.out.println("banana : "+map.get("banana"));

		String countStr = (String) map.get("count");
        int count = Integer.parseInt(countStr); // 문자열을 정수로 변환
        count++;  // count 값을 1 증가

        return Integer.toString(count);
	}	
}
