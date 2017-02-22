package org.controllers;

import org.models.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

	@RequestMapping("/weather")
	@ResponseBody
	public Weather getWeather(@RequestParam final String city) {
		
		return new Weather(city, 50);
	}
}
