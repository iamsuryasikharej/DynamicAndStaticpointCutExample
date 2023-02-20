package com.surya.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class MyContoller {
@GetMapping("/hello")
public String hello()
{
	return "hello";
}
}
