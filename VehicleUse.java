package inheritance;

public class VehicleUse {
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.color = " Red";
	v.print();
	
	Car c = new Car();
	c.color = "Blue";
	c.maxSpeed = 120;
	c.numDoors = 4;
	c.price = 23;
	c.print();
	
	Bicycle b = new Bicycle();
	b.print();
	
}
}
