package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    void start() {
        
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.add(panel);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
		
		if (arg0.getSource() == b1) {
			String city = new JOptionPane().showInputDialog("What city would you like the weather for?");
			 // All city keys have the first letter capitalized of each word
			String cityName = Utilities.capitalizeWords(city);
	        WeatherData datum = weatherData.get(cityName);
			
	        if( datum == null ) {
				System.out.println("Unable to find weather data for: " + cityName);
		    } 
			else {
			    double temp = (datum.temperatureF - 32) * 5/9;
			    float t = Math.round(temp);
				System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + t + " Celsius");
		    }
		}
		else if (arg0.getSource() == b2) {
			String weather = new JOptionPane().showInputDialog("Type in a weather type.");
			
		}
        
      
	}
}
