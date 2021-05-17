package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.ProductBean;
import com.bean.UserInfo;

@Controller
public class ProductController {
	@RequestMapping("/Submit")
	public String login() {
		return "Login";
		
	}
	@RequestMapping("/login")
	public String doProcess() {
		
		return "Success";
	}
	@RequestMapping("/product")
	public String addProduct() {
		return "Product";
	}
	@RequestMapping("/Register") 
	public String database(@ModelAttribute("pro") ProductBean b) {
		return "ProductDetails";
	}
	
}
