package com.e3docs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("e3docs")
public class E3DocsController {

	@GetMapping("/getlist")
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("China");
		list.add("United States(US)");
		list.add("Russia");
		list.add("Australia");
		list.add("African");
		list.add("Europe");
		return list;
	}
}
