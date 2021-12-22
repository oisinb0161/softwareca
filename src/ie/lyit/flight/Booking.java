//Software Implmentation CA 2
//oisin bonner
//L00146921

package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {
	
    private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private static int bookingNo = 10000;
	
   
   //contructors
	public Booking() {
		outbound = new Flight();
		inbound = new Flight();
		passengers = new ArrayList<Passenger>();
      bookingNo++;
		totalPrice = 0;
	}
	
	
	public Booking(Flight outBoundFlight, Flight inboundFlight, ArrayList<Passenger> p) {
		outbound = outBoundFlight;
		inbound = inboundFlight;
		passengers = p;
		totalPrice = 0;
		bookingNo++;
	   }
	

	
	
   //set methods 
   
   
   //setOutBound() 
	public void setOutBound(Flight outboundFlight) {
		outbound = outboundFlight;
	}
	
	//setsInbound()
	public void setInBound(Flight inboundFlight) {
		outbound = inboundFlight;
	}
	
	//setsPassengers()
	public void setPassengers(ArrayList<Passenger> p) {
		passengers = p;
	}
	
    //setTotalPrice() 
	public void setTotalPrice() {
			calculatePrice(); 
		}
	
	//calculatesPrice()
	public void calculatePrice() {
		totalPrice = (outbound.getPrice() + inbound.getPrice() ) * passengers.size();
	}
	
	//findPassesnger()
	public boolean findPassenger(Passenger p) {
		if(passengers.contains(p)) {
			return true;
		}
		else{
			return false;
		}
	}
	
	//string 
	@Override
	public String toString() {
		String output = null;
		   return output = "OUTBOUND FLIGHT: " + getOutbound() +
				   "INBOUND FLIGHT:" + getInbound() +
				   "PASSESNGERS: " + getPassengers() +
				   "TOTAL PRICE: " + getTotalPrice();
		}
    
    
    
   //get methods 
	
   
   //getOutbound()
	public Flight getOutbound() {
		return outbound;
	}
   
   

	//getInbound()
	public Flight getInbound() {
		return inbound;
	}
   
   

	//getPassengers()
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
   
   

	//getTotalPrice()
	public double getTotalPrice() {
		return totalPrice;
	}
    
	//getNextBookingNo()
	public static int getNextBookingNo() {
		int nextBookingNo= bookingNo+=1;
		return nextBookingNo;
	   }
   			
	//method checks if objects are equal
	@Override
	public boolean equals(Object obj){
   
		
		Booking bookObject = new Booking();
		if (obj instanceof Booking)
			bookObject = (Booking)obj;
         
			
			if(bookObject.getInbound() == inbound && 
					bookObject.getOutbound() == outbound && 
					bookObject.getPassengers() == passengers &&
					bookObject.getTotalPrice() == totalPrice) 
				
				return true;
			   else {
			
		    
          return false;
		}
	}
}
