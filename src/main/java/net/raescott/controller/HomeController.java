package net.raescott.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController {
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(Model model, HttpServletRequest request) {
		logger.debug("Hit index.jsp page.");

		Locale locale = request.getLocale();
		logger.debug("locale: ", locale);

		String firstName = messageSource.getMessage("first.name", null, locale);
		logger.debug("firstName: ", firstName);
		model.addAttribute("firstName", firstName);
		return "index";
	}
}