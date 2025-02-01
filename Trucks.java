
public class Trucks extends Vehicle {
  int loadCapacity;

public Trucks(String name, double rentalCostPerDay,int loadCapacity) {
	super(name, rentalCostPerDay);
	this.loadCapacity = loadCapacity;
}

@Override
public String toString() {
	return "Trucks [loadCapacity=" + loadCapacity + ", name=" + name + ", rentalCostPerDay=" + rentalCostPerDay + "]";
}
@Override
public double rentalCost(int days) {
	this.totalCost+=rentalCostPerDay*days;
	return totalCost;
}
}
