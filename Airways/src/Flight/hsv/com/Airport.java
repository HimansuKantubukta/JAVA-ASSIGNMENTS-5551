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
	else
	{
		

        return false;
	}

    }
	
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination){



        ArrayList<Flight> searchResults = new ArrayList<>();



        for(Flight flight: flights) {



            if(flight.getDestination().equals(destination) && flight.getSource().equals(source)) {



                searchResults.add(flight);



            }



        }



        return searchResults;

    }


public void bookTicket(String flightId, Traveller travel)

{



        for(Flight flight:flights)



            if(flight.getId()==flightId && flight.getAvailableSeats()>=1)



                flight.setAvailableSeats(flight.getAvailableSeats()-1);

            travellers.add(travel);    }


	


	
	
	

}
