package Flight.hsv.com;

import java.util.ArrayList;
import java.util.ListIterator;

public class Airport
{
	private String City;
	private int  pincode;
	ArrayList<Flight>flights=new ArrayList<Flight>();
	ArrayList<Traveller>travellers=new ArrayList<Traveller>();
		
	public boolean addFlight(Flight flight) 
	{

        if(!flights.contains(flight))
        {

            flights.add(flight);

            return true;

        }

        return false;

    }
	public void searchFlightsBySourceAndDestination1(String source,String Destination)
	{
		if(!flights.contains(source))
		{
			if(!flights.contains(Destination))
			{
				
			}
		}
		
		
		
	}
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination){



        ArrayList<Flight> searchResults = new ArrayList<>();



        for(Flight fly: flights) {



            if(fly.getDestination().equals(destination) && fly.getSource().equals(source)) {



                searchResults.add(fly);



            }



        }



        return searchResults;

    }


public void bookTicket(String flightId, Traveller travel)

{



        for(Flight fly:flights)



            if(fly.getId()==flightId && fly.getAvailableSeats()>=1)



                fly.setAvailableSeats(fly.getAvailableSeats()-1);

            travellers.add(travel);    }


	


	
	
	

}
