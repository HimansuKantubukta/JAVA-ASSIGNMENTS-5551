package Flight.hsv.com;
public class Traveller 
{
	private String name;
	private long mobile;
	private String flightId;
	public Traveller(String name, long mobile, String flightId) 
	{
				this.name = name;
		this.mobile = mobile;
		this.flightId = flightId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	
	
	

	 
	

}
