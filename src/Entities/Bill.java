package Entities;

public class Bill {
	
	char gender;
	int beer;
	int barbecue;
	int softDrink;
	
	
	public double cover() {	
		return 4;
	}
	
	public double feeding(double a, double b, double c) {	
		return a + b + c;
	}
	
	public double ticket(double gender) {
		if(gender == 'M') {
			return 10.0;		
		}
		else {
			return 8.0;
		}
	}
	
	public double total(double a, double b, double c) {	
		return a + b + c;
	}
	

}
