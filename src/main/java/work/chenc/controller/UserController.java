package work.chenc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import work.chenc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", userService.findAll());
		mv.setViewName("user_list");
		return mv;
	}

}
