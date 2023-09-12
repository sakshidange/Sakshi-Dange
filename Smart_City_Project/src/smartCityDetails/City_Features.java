package smartCityDetails;

import java.util.Scanner;

public class City_Features {

	public String admin_name;
	public String category;
	public String address;
	public String city_name;
	public int contact;
	
	Scanner sc=new Scanner(System.in);
	public City_Features() { 
		System.out.println("Enter the city : ");
		this.city_name=sc.next();
		System.out.println("Enter the category : ");
		this.category=sc.next();
		System.out.println("Enter the address: ");
		this.address=sc.next();
		System.out.println("Enter the contact no.: ");
		this.contact=sc.nextInt();

		}
		
	}

