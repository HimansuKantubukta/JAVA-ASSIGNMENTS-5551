package Himansu.Himansu;

import java.util.ArrayList;

public class Airways 
{
	public static void main(String[] args)
	{
		Airport a =new Airport();
		
		
		ArrayList<Flight> fly=new ArrayList<>();
		
		Flight f1= new Flight("apqwer123","vishakapatnam","Hyderabad",2000,1000,696,"7:00","8:00","indigo");
		
		Flight f2=new Flight("amhijkr153","Hyderabad","bangalore",4000,1000,696,"7:10","8:10","kingfisher");
		Flight f3=new Flight("aptyu167340","chennai","Delhi",2000,1000,696,"7:00","8:00","indigo");

		Flight f4=new Flight("maweer145","Mumbai","Hyderabad",2000,1000,696,"7:00","8:00","indigo");

		Flight f5=new Flight("ramertr193","Kolkata","Ahmedabad",2000,1000,696,"7:00","8:00","indigo");

		
		a.addFlight(f1);
		a.addFlight(f2);
		a.addFlight(f3);
		a.addFlight(f4);
		a.addFlight(f5);
		
		
		
		a.showFlights();
		System.out.println();
		
		
		a.searchFlightsBySourceAndDestination("Mumbai","Hyderabad");
		
		Traveller t1=new Traveller("Himansu",939330812,"kanyui123@gmail.com","apqwer123","22-08-2023");
		Traveller t2=new Traveller("Hi",939330812,"kanyui123@gmail.com","amhijkr153","22-08-2023");

		Traveller t3=new Traveller("Himans",939330812,"kanyui123@gmail.com","aptyu167340","22-08-2023");

		Traveller t4=new Traveller("Hisu",939330812,"kanyui123@gmail.com","ramertr193","22-08-2023");
		
		
		
		
		
		
		//a.addTraveller(t2);

		
		System.out.println();
		
		a.bookTicket("aptyu167340",t3);
		
		
		System.out.println();

		a.showTravellers();
		
		System.out.println();
		a.showFlights();

	
	}

}
