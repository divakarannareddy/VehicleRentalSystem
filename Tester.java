
import java.util.Scanner;

public class Tester {
    public static void rentingProcess(Vehicle v) {
    	  System.out.println("Please select vehicle which you need fro rental");
          System.out.println("\t\tEnter 1 for Car \n \t\tEnter 2 for Bike \n \t\tEnter 3 for Truck");
          Scanner sc = new Scanner(System.in);
          int select = sc.nextInt();
    	if(v.checkAvaliability(v.avaialabilityStatus)) {
        switch(select) {
        case 1:
        	v=new Car("Maruthi",1500,5);
        	System.out.println("Enter customer name:");
        	String name = sc.nextLine();
        	name = sc.nextLine();
        	System.out.println("Enter customer contact number:");
        	String number = sc.nextLine();
        	System.out.println("How many days do you need for rental");
        	int days = sc.nextInt();
        	Customer c =new Customer(name,number,days,v);
        	System.out.print("Total RentalCost: ");
        	System.out.print(c.rentalCost());
        	System.out.println();
        	System.out.println(c);
            System.out.println("Do you need to extend rental duration?");
            String s = sc.next();
            if(s.equalsIgnoreCase("yes")) {
            	c.setRentalDuration(c.extendRentalDuration());
             	System.out.println("Updated rentalCost: "+c.rentalCost());
            }
            else {
            	System.out.println("Thanks for your confirmation Happy journey!");
            }
        	break;
        case 2:
        	v=new Bikes("R15",1000,300);
        	System.out.println("Enter customer name:");
        	name = sc.nextLine();
        	name = sc.nextLine();
        	System.out.println("Enter customer contact number:");
        	number = sc.nextLine();
        	System.out.println("How many days do you need for rental");
            days = sc.nextInt();
        	c =new Customer(name,number,days,v);
        	System.out.print("Total RentalCost: ");
        	System.out.print(c.rentalCost());
        	System.out.println();
        	System.out.println(c);
        	 System.out.println("Do you need to extend rental duration?");
              s = sc.next();
        	  if(s.equalsIgnoreCase("yes")) {
              	c.setRentalDuration(c.extendRentalDuration());
               	System.out.println("Updated rentalCost: "+c.rentalCost());
              }
              else {
              	System.out.println("Thanks for your confirmation Happy journey!");
              }
        	break;
        case 3 :
        	v=new Trucks("Mahindra",10000,5);
        	System.out.println("Enter customer name:");
        	name = sc.nextLine();
        	name = sc.nextLine();
        	System.out.println("Enter customer contact number:");
        	number = sc.nextLine();
        	System.out.println("How many days do you need for rental");
            days = sc.nextInt();
        	c =new Customer(name,number,days,v);
        	System.out.print("Total RentalCost: ");
        	System.out.print(c.rentalCost());
        	System.out.println();
        	System.out.println(c);
        	System.out.println("Do you need to extend rental duration?");
            s = sc.next();
        	  if(s.equalsIgnoreCase("yes")) {
              	c.setRentalDuration(c.extendRentalDuration());
               	System.out.println("Updated rentalCost: "+c.rentalCost());
              }
              else {
              	System.out.println("Thanks for your confirmation Happy journey!");
              }
        	
        	break;
        }
        
        }
    	else {
    		System.out.println("Sorry sir, vehicle not available!");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Vehicle v = new Vehicle();
    rentingProcess(v);
	}

}
