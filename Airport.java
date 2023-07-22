package Himansu.Himansu;

import java.util.ArrayList;

public class Airport 
{
	ArrayList<Flight> fly=new ArrayList<>();
	ArrayList<Traveller>travel=new ArrayList<>();

	
//Flight f=new Flight("apqwer123","vishakapatnam","Hyderabad",2000,1000,696,"7:00","8:00","indigo");
	    
	
	
	
	
	public boolean addFlight(Flight flights)
	{
		fly.add(flights);
			
		   return true;
		
	}
	public void showFlights()
	{
		for(int i=0;i<fly.size();i++)
		{
			System.out.println(fly.get(i));
		}
	}
	

	
	public  void searchFlightsBySourceAndDestination(String source,String Destination)
	{
		for(int i=0;i<fly.size();i++)
		{
			if(fly.get(i).getSource().equals(source)&&fly.get(i).getDestination().equals(Destination))
			{
				System.out.println(fly.get(i));
			}
			
				
		}
		
		
	
		
	}
	
	public void addTraveller(Traveller traveller)
	{
		for(int i=0;i<travel.size();i++)
		{
			System.out.println(travel.get(i));
		}
	}
	public void showTravellers()
	{
		for(int i=0;i<travel.size();i++)
		{
			System.out.println(travel.get(i));
		}
	}
	
	
	public void bookTicket(String flightId,Traveller traveller)
	{
		for(int i=0;i<fly.size();i++)
		{
	
			if(fly.get(i).getId().equals(flightId) && fly.get(i).getAvailableSeats() >=1 )
			{
				fly.get(i).setAvailableSeats(fly.get(i).getAvailableSeats()-1);
				
				 travel.add(traveller);
				
			}
		}
	}
			
		
	}
	
	


