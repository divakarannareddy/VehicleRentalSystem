
import java.util.Scanner;

public class Customer {
    String name;
    String contactNumber;
    int rentalDuration;
    Vehicle v;
	public Customer(String name, String contactNumber, int rentalDuration, Vehicle v) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.rentalDuration = rentalDuration;
		this.v = v;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contactNumber=" + contactNumber + ", rentalDuration=" + rentalDuration
				+ ", vehicle Details=" + v + "]";
	}
	
	
	public int getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public double rentalCost() {
		return v.rentalCost(rentalDuration);
	}
	
	public int extendRentalDuration() {
		System.out.println("How many days do you need to extend?");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		return d;
	}
    
}
