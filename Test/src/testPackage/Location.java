package testPackage;

public class Location {


String country;
String city;

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


Location(String country, String city){
this.country = country;
this.city = city;

}

public String toString() {
	
return country + " " + city;
	}




}
