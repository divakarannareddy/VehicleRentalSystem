
public class Bikes extends Vehicle {
   int engineSize;

public Bikes(String name, double rentalCostPerDay,int engineSize) {
	super(name, rentalCostPerDay);
	this.engineSize = engineSize;
}

@Override
public String toString() {
	return "Bikes [engineSize=" + engineSize + "cc"+", name=" + name + ", rentalCostPerDay=" + rentalCostPerDay + "]";
}
@Override
public double rentalCost(int days) {
	this.totalCost+=rentalCostPerDay*days;
	return totalCost;
}
}
