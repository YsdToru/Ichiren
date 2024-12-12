package com.example.demo.control;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.form.UserForm;
import com.example.demo.service.UserLoginServiceInterface;

@Controller
@RequestMapping("/taskdon")
public class LoginController {

	@Autowired
	HttpSession session;

	@Autowired
	@Qualifier("userService")
	UserLoginServiceInterface userS;
	
	@GetMapping("login")
	public String login() {
		return "admin/login";
	}
	

	@PostMapping("login")
	public ModelAndView login(UserForm f, ModelAndView mav) {

		boolean isExists = userS.userExists(f.getUser_id(), f.getUser_pass());
		
		System.out.println(f.getUser_id());
		

		if (isExists) {

			System.out.println("ログイン成功");
			mav.setViewName("admin/menu");
		} else {

			System.out.println("ログイン失敗");
			mav.setViewName("admin/login");
		}

		return mav;

	}

}