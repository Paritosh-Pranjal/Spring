package com.code.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getWelcome() {

        // Logs exception
        logger.error("This is an Error message", new Exception("Testing"));

        ModelAndView model = new ModelAndView("welcome");
        model.addObject("msg", "Hello Spring MVC + Log4j");
        return model;
    }
}
