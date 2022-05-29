package com.example.sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String showWelcomePage() {
		return "welcome to Springboot Sample Application";
	}

	@RequestMapping("/app")
	@ResponseBody
	public String getHostName(ModelMap model) throws UnknownHostException {
		String hostname = InetAddress.getLocalHost().getHostName();
		System.out.println("Hello from: " + hostname);
		return "Hello Human, from " + hostname;
	}

}
