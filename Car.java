
public class Car extends Vehicle {
    int seatingCapacity;

	public Car(String name, double rentalCostPerDay, int seatingCapacity) {
		super(name, rentalCostPerDay);
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Car [seatingCapacity=" + seatingCapacity + ", name=" + name + ", rentalCostPerDay=" + rentalCostPerDay
				+ "]";
	}
	@Override
	public double rentalCost(int days) {
		this.totalCost+=rentalCostPerDay*days;
		return totalCost;
	}
}
