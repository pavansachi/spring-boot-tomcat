package org.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.models.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * rest controller for weather operations
 * @author pavansachi
 *
 */

@Controller
public class WeatherController {

	private Log log = LogFactory.getLog(WeatherController.class);
	
	@RequestMapping("/weather")
	@ResponseBody
	public Weather getWeather(@RequestParam final String city) {
		
		log.info("getWeather(city)");
		
		return new Weather(city, 50);
	}
}
