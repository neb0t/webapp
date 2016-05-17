package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage(HttpServletRequest request) {
        final String userIpAddress = request.getRemoteAddr();
        final String userHostName = request.getRemoteHost();
        final String userAgent = request.getHeader("user-agent");
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "Hello World!");
        model.addObject("userIpAddress", userIpAddress);
        model.addObject("userAgent", userAgent);
        model.setViewName("index");
        return model;
    }
}
