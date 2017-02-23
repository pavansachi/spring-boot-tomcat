package org.models;

/**
 * weather model
 * @author pavansachi
 *
 */
public class Weather {

	private String city;
	private int temperature;
	
	public Weather() {
		
	}
	
	public Weather(final String city, final int temp) {
		this.city = city;
		this.temperature = temp;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
