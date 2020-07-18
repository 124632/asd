package com.xworkz.springmvc.controller;

import org.springframework.stereotype.Component;

import com.xworkz.springmvc.dto.CalamitieDTO;
import com.xworkz.springmvc.service.CalamitieService;

@Component
@RequestMapping(value = "/")
public class CalamitieController {

	@Autowired
	private CalamitieService service;

	public CalamitieController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/Register.odc")
	public String message(CalamitieDTO dto, Model model) {
		System.out.println("invoked message() method");
		System.out.println(dto);
		int i = service.createAndValidate(dto);
		if(i==0) {
			System.out.println("Sending response to success.jsp");
			model.addAttribute("dtoClass", dto);
			return "success";
		} else {
			System.out.println("sending response to index.jsp");
			model.addAttribute("valid", "Some fields are missing, so enter the details again");
			return "index";
		}

	}

} 
