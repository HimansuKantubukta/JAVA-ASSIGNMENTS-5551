package Himansu.Himansu;
class Traveller 
{
	private String Name;
	private long mobile;
	private String email;
	private String flightId;
	private String localDate;
	public Traveller(String name, long mobile, String email, String flightId, String localDate) 
	{
		Name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.localDate = localDate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getLocalDate() {
		return localDate;
	}
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "Traveller [Name=" + Name + ", mobile=" + mobile + ", email=" + email + ", flightId=" + flightId
				+ ", localDate=" + localDate + "]";
	}
	
	
	

}
