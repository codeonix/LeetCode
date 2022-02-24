package inheritance;

public class Vehicle {
 private String color;
 protected  int maxSpeed;
 protected  int price;
 
 public String getColor() {
	 return this.color;
 }
 public void setColor(String color) {
	 this.color = color;
 }
 public void print() {
	 System.out.println("Color is :"+color);
	 System.out.println("Max speed is :"+maxSpeed );
	 System.out.println("Price is "+price);
 }
 
}
