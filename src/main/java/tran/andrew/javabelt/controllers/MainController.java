package tran.andrew.javabelt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import tran.andrew.javabelt.services.UserService;
import tran.andrew.javabelt.services.YogaService;

@Controller
@RequestMapping
public class MainController {
	@Autowired
	private YogaService yogaService;
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String dashboard(HttpSession session, Model model) {
		System.out.println("user_id in session: " + session.getAttribute("user_id"));
		if (session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		model.addAttribute("allClasses", yogaService.getAll());
		model.addAttribute("loginUser", userService.getUser((Long) session.getAttribute("user_id")));
		return "main/dashboard.jsp";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
