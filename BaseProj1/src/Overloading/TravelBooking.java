package Overloading;

public class TravelBooking {
	
	void bookTicket(String busNumber, String date) {
		System.out.println("Bus ticket is booked with "+busNumber+" on "+date);
	}
	
	void bookTicket(String flightNumber, String date, String seatClass) {
		System.out.println("Flight ticket with "+flightNumber+" is booked on "+date+" in "+seatClass);
	}
	
	void bookTicket(String trainNumber, String date, int coachNumber) {
		System.out.println("Train ticket with "+trainNumber+" on "+date+" in "+coachNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelBooking tb = new TravelBooking();
		
		tb.bookTicket("KA02EW2006", "05-05-2025");
		tb.bookTicket("ARIN1234", "10-05-2025", "B2");
		tb.bookTicket("165038","12-05-2025", 15);

	}

}
