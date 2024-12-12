package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

	
	/**
	 * Pushのテスト1
	 * @param model
	 * @return
	 */
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		// ログイン処理を実装する
		// 例: ユーザー名とパスワードをチェックする
		if (username.equals("admin") && password.equals("password")) {
			return "redirect:/home";
		} else {
			model.addAttribute("error", "Invalid username or password");
			return "login";
		}
	}
}