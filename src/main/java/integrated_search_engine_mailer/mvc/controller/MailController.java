package integrated_search_engine_mailer.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

	@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView hello() {
		System.out.println("/hello");
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("hello");
		
		model.addObject("message", "hello");
		
		return model;
	}
}
