//Software Implmentation CA 2
//oisin bonner 
//l00146921

package ie.lyit.testers;


import ie.lyit.flight.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;



public class BookingTesters {
	Booking book;
	Flight inbound, outbound;
	ArrayList<Passenger> passengers;
	Passenger passenger1;
	
	
	@Before
	public void setUp() throws Exception { 
		inbound = new Flight("781DER,","Derry", "London",new Date(22,12,2021),new Time(12,00),17.00);
		outbound = new Flight("782DER","Derry", "London",new Date(22,12,2021),new Time(14,00),17.00);
		passengers = new ArrayList<Passenger>();
		passenger1 = new Passenger("Mrs", "Marge", "Simpson",28 12 ,1995, 1, false);
		passengers.add(passenger1);
		book = new Booking(inbound, outbound, passengers);
	}
	
	//testing each set method
   	@Test
	public void testSetOutbound() {
		Flight flightTest = new Flight("781DER","Derry", "London",new Date(22,12,2021),new Time(14,00),17,00);
		book.setOutBound(flightTest);
		assertEquals(book.getOutbound(), flightTest);
	}
	
	@Test
	public void testSetInbound() {
		Flight flightTest = new Flight("781DER","Derry", "Dublin",new Date(22,12,2021),new Time(12,00),17,00);
		book.setOutBound(flightTest);
		assertEquals(book.getOutbound(), flightTest);
	}
	
	@Test
	public void testSetPassenger() {
		ArrayList<Passenger> passenger2 = new ArrayList<Passenger>();
		book.setPassengers(passenger2);
		assertEquals(book.getPassengers(), passenger2 );
	}
   
   //testing calculatePrice()
   @Test
	public void testCalculatePrice(){
		double endPrice = passengers.size() * (inbound.getPrice() + outbound.getPrice() );
		book.calculatePrice();
		assertEquals(endPrice, book.getTotalPrice(), 0.0 );
	}
   
   //testing findPassesnger()
  	@Test
	public void testFindPassenger() {
		assertTrue(book.findPassenger(passenger1) );
	}
   

	@Test
	public void testBookingInfo() {
		
		assertEquals(book.getInbound(), outbound );
		assertEquals(book.getOutbound(), inbound );
		assertEquals(book.getPassengers(), passengers );
	}
	
	@Test
	public void testSetTotalPrice() {
		double endPrice = passengers.size() * (inbound.getPrice() + outbound.getPrice() );
		book.calculatePrice();
		assertEquals(endPrice, book.getTotalPrice(), 0.0 );
	}
	
	@Test
	public void testEquals() {
		Booking book2 = book;
		assertTrue(book.equals(book) );
	
	}
}