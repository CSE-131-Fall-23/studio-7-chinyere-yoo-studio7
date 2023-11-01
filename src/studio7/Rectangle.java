package studio7;

import module07._2constructor.Car;

public class Rectangle {
	
	private double height;
	private double width;
	
	public Rectangle(double height, double width) { //constructor

		this.height = height;
		this.width = width;
	
	}

	public double getarea() {
		double area = height * width;
		return area;
	}
	
	public double peri() {
		double peri = 2 * (height + width);
		return peri;
	}
	
	public boolean isSquare() { 
		if (height == width) {
			return true;
		}
		else {
			return false;
		}
	}

public static void main(String[] args) {
	
		Rectangle R1 = new Rectangle(3.5, 9.7); //instances
		Rectangle R2 = new Rectangle(4.21, 2.6);
		double n = R1.getarea();
		double m = R2.getarea();
		compare(n, m);
		System.out.println(compare(n, m));
}

public static String compare(double R1, double R2) { 
	if (R1 > R2) {
		return "R1's area: " + R1 + " is bigger than R2's area: " + R2;
	}
	else {
		
			return "R2's area: " + R2 + " is bigger than R1's area: " + R1;


}
}}




