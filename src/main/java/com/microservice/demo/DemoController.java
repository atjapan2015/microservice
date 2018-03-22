package com.microservice.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // 该注解是一个复合注解，其所包含的比较重要的注解是@Controller和@ResponseBoyd，指定controller返回的对象自动转化为json格式返回（基本类型及其包装类、String除外）
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello World!";
	}
}
