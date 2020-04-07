
package classes;

/*
Class for Boarding passes
*/

public class BoardingPass {
    private String seatNumber;
    private Passenger psngr;
    private Flight flight;
    
//    Constructor
    public BoardingPass() {
        
    }
    
    
//    Setter and getters
    public Passenger getPsngr() {
        return psngr;
    }

    public void setPsngr(Passenger psngr) {
        this.psngr = psngr;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    //toString method to print the Boarding pass details
    @Override
    public String toString(){
        return "Passenger: "+this.psngr.getPassengerFname()+" "+this.psngr.getPassengerLname() +"\nLeaving From: "+this.flight.getOrigin()+"\nDestined To: "+this.flight.getDestination()+"\nFlight No: " +this.flight.getFlightNumber()+"\nSeat No :"+this.getSeatNumber();
    }
    
}//class ends