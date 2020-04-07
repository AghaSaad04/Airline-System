
package classes;

/**
 *
 * @author hadi
 */
public class Passenger {
    
    private String passengerFname;
    private String passengerLname;
    private String passNumber;
    //private String flightNumber;

//    Constructors
    public Passenger() {
    }

    
    public Passenger(String passengerFname, String passengerLname, String passNumber, String flightNumber) {
        this.passengerFname = passengerFname;
        this.passengerLname = passengerLname;
        this.passNumber = passNumber;
        //this.flightNumber = flightNumber;
    }
  
//    Passenger's Setters and getters
    public String getPassengerFname() {
        return passengerFname;
    }

    public void setPassengerFname(String passengerFname) {
        this.passengerFname = passengerFname;
    }

    public String getPassengerLname() {
        return passengerLname;
    }

    public void setPassengerLname(String passengerLname) {
        this.passengerLname = passengerLname;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }
}//passenger class ends
