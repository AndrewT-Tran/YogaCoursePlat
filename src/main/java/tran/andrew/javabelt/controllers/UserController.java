package tran.andrew.javabelt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import tran.andrew.javabelt.models.LoginUser;
import tran.andrew.javabelt.models.User;
import tran.andrew.javabelt.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/login/register")
	public String loginReg(@ModelAttribute("newUser") User user, @ModelAttribute("loginUser") LoginUser loginUser) {
		return "user/loginReg.jsp";
	}

	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("newUser") User user, BindingResult result, Model model, HttpSession session) {
		// reject value if email is taken
		if(userService.getUser(user.getEmail()) != null) {
			result.rejectValue("email","Unique","Email already in use!");
		}
		//reject if passwords dont match
		if(!user.getPassword().equals(user.getConfirm())) {
			result.rejectValue("password","Match", "Confirm password must match");
		}
		if(result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "user/loginReg.jsp";
		}
		User newUser = userService.registerUser(user);
		if(newUser == null) {
			result.rejectValue("email","Unique","Email already in use!");
			model.addAttribute("loginUser", new LoginUser());
			return "user/loginReg.jsp";
		}
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/";
	}

	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model,HttpSession session) {
		User loggingUser = userService.login(loginUser, result);
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "user/loginReg.jsp";
		}
		session.setAttribute("user_id", loggingUser.getId());
		return "redirect:/";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}