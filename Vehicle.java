
public class Vehicle {
  String name;
  double rentalCostPerDay;
  String avaialabilityStatus="yes";
  double totalCost;
public Vehicle(String name, double rentalCostPerDay) {
	super();
	this.name = name;
	this.rentalCostPerDay = rentalCostPerDay;
	
}

public Vehicle() {
	super();
}

public String getAvaialabilityStatus() {
	return avaialabilityStatus;
}

public void setAvaialabilityStatus(String avaialabilityStatus) {
	this.avaialabilityStatus = avaialabilityStatus;
}

public double getTotalCost() {
	return totalCost;
}

public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}

@Override
public String toString() {
	return "Vehicle [name=" + name + ", rentalCostPerDay=" + rentalCostPerDay + "]";
}

public boolean checkAvaliability(String avaialabilityStatus) {
	if(avaialabilityStatus.equalsIgnoreCase("yes")) {
		return true;
	}
	else {
		return false;
	}
}

public double rentalCost(int days) {
	this.totalCost+=rentalCostPerDay*days;
	return totalCost;
}

}
