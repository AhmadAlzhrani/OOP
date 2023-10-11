package lab14;

public class City implements Comparable<City>, Cloneable {
	
private String cityName;
private int temperature;

public City(String name , int temp) {
	cityName = name;
	temperature = temp;
}
public void setTemperature(int temp) {
	temperature = temp;
}
public int getTemperature() {
	return temperature;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public  String getCityName() {
	return cityName;
}
public String toString() {
	return "city name: "+cityName+"   temp: "+temperature;
}
public int compareTo(City o) {
	if (temperature > o.temperature)
		return 1;
	else if (temperature < o.temperature)
		return -1;
	else 
		return 0;
}
public City clone() {
    try {
      return (City) super.clone();
    }
    catch (CloneNotSupportedException ex) {
      return null;
    }
  }
}

