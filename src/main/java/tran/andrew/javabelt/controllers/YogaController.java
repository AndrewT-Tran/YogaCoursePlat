package tran.andrew.javabelt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import tran.andrew.javabelt.models.Yoga;
import tran.andrew.javabelt.services.UserService;
import tran.andrew.javabelt.services.YogaService;

@Controller
@RequestMapping("/yogas")
public class YogaController {
	@Autowired
	private YogaService yogaService;
	@Autowired
	private UserService userService;

	@GetMapping("/create")
	public String createYoga(@ModelAttribute("yoga") Yoga yoga) {
		return "/yoga/create.jsp";
	}

	@PostMapping("/process/create")
	public String processNewDonation(@Valid @ModelAttribute("yoga") Yoga yoga, BindingResult result) {
		if (result.hasErrors()) {
			return "/yoga/create.jsp";
		}
		yogaService.create(yoga);
		return "redirect:/";
	}

	@RequestMapping(value = "/process/edit/{id}", method = RequestMethod.PUT)
	public String processEditYoga(@Valid @ModelAttribute("yoga") Yoga yoga, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "/yoga/edit.jsp";
		}
		yoga.setInstructor(userService.getUser((Long) session.getAttribute("user_id")));
		yogaService.update(yoga);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String editYoga(@PathVariable("id") Long id, Model model) {
		model.addAttribute("yoga", yogaService.getOne(id));
		return "yoga/edit.jsp";
	}

	@DeleteMapping("/{id}")
	public String deleteYoga(@PathVariable("id") Long id) {
		yogaService.delete(id);
		return "redirect:/";
	}

	@GetMapping("/classes/{id}")
	public String displayOne(@PathVariable("id") Long id, Model model) {
		Yoga yoga = yogaService.getOne(id);
		model.addAttribute("yoga", yoga);
		return "yoga/displayOne.jsp";
	}
}
