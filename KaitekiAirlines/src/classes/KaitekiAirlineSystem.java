package classes;

import GUI.KaitekiAirlineGUI;
//import classes.KaitekiAirlineSystem.flights;
import java.util.ArrayList;
import classes.Passenger;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KaitekiAirlineSystem {

    //private Passenger passenger;
    static ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    static ArrayList<Flight> flights = new ArrayList<Flight>();
    static ArrayList<BoardingPass> boardingPasses = new ArrayList<BoardingPass>();
    private KaitekiAirlineGUI gui;
    

    public ArrayList<Flight> getFlights() {
        return KaitekiAirlineSystem.flights;
    }

    public void setFlights(Flight flights) {
        KaitekiAirlineSystem.flights.add(flights);
    }
   
    int test=0;

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        KaitekiAirlineSystem.passengers = passengers;
    }

//    Flight f4=new Flight();
    public KaitekiAirlineSystem() {

//        flights.add(f1);
//        
//        flights.add(f2);
//        flights.add(f3);
    }

    public KaitekiAirlineSystem(KaitekiAirlineGUI gui) {
        this.gui = gui;
    }

//***************************Adding Passenger***********************************************************
    public String addPassenger(String firstName, String lastName, String passportNo) {

        Passenger p = new Passenger();
        p.setPassengerFname(firstName);
        p.setPassengerLname(lastName);
        p.setPassNumber(passportNo);
//        p.setFlightNumber(flightNo);
        passengers.add(p);
        return "Successfully Added";
    }

    //static KaitekiAirlineGUI k=new KaitekiAirlineGUI();
    
//***************************************Update Passenger*****************************************************
    public String updatePassenger(String firstName, String lastName, String passportNo) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassNumber().equals(passportNo)) {
                passengers.get(i).setPassengerFname(firstName);
                passengers.get(i).setPassengerLname(lastName);
                passengers.get(i).setPassNumber(passportNo);
//                passengers.get(i).setFlightNumber(flightNo);
                return "Updated";
            }
        }
        return "Not Found";
    }

//***************************Find Passenger*****************************
    public ArrayList<String> findPassenger(String newPass) {
        ArrayList<String> found = new ArrayList<String>();
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassNumber().equals(newPass)) {
                found.add(passengers.get(i).getPassengerFname());
                found.add(passengers.get(i).getPassengerLname());
                return found;
            }
        }
//        System.out.println("NotFound");
        found.add("");
        return found;
    }
    
//********************************************************************************************

    
    
//**************************issue boardingpasses*******************************************************************
    public String issueBoardingPass(String passportNo, String flightNo) {
        int ii= 0;
        
        BoardingPass b = new BoardingPass();
        System.out.println(getFlights().size()+" aaaaa");
        if (getFlights().get(searchFlight(flightNo)).getSeats().size() == 0) {
            for (int j = 0; j < passengers.size(); j++) {
                if (passengers.get(j).getPassNumber().equals(passportNo)) {
                    b.setPsngr(passengers.get(j));
                    b.setFlight(getFlights().get(searchFlight(flightNo)));
                    getFlights().get(searchFlight(flightNo)).assignSeat(b);
                    boardingPasses.add(b);
                    getFlights().get(searchFlight(flightNo)).setSeats(b);
                    return passengers.get(j).getPassengerFname() + passengers.get(j).getPassengerLname() + passengers.get(j).getPassNumber() + flightNo;
                }
            }
        }    
        if (findPassenger(passportNo).get(0).equals("")) {
            return "Not Found in System";
        }
        System.out.println(test);
            while(ii<flights.get(searchFlight(flightNo)).getSeats().size()){
                if (flights.get(searchFlight(flightNo)).getSeats().get(test).getPsngr().getPassNumber().equals(passportNo)) {
                    break;
                }
                
                    for (int j = 0; j < passengers.size(); j++) {
                        if (passengers.get(j).getPassNumber().equals(passportNo)) {
                            b.setPsngr(passengers.get(j));
                            b.setFlight(flights.get(searchFlight(flightNo)));
                            flights.get(searchFlight(flightNo)).assignSeat(b);
                            boardingPasses.add(b);
                            flights.get(searchFlight(flightNo)).setSeats(b);
                             
                             test++;
                             
                            return passengers.get(j).getPassengerFname() + passengers.get(j).getPassengerLname() + passengers.get(j).getPassNumber() + flightNo;
                        }                      
                    }
                    ii++;//test++;
                }
        return "S";
    }
//********************************************************************************************
    
    

    
//    *********Return Boarding Passs*********************************************************
    public String getBoardingPass(String passportNo, String flightNo) {
        BoardingPass b = new BoardingPass();
        Flight f = new Flight();
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassNumber().equals(passportNo)) {
                for (int ii = 0; ii < f.getSeats().size(); ii++) {
                    if (f.getSeats().get(ii).getPsngr().getPassNumber().equals(passportNo)) {
                        return getFlights().get(searchFlight(flightNo)).getSeats().get(ii).toString();
                    }
                }
            }
        }
        return "Boarding Pass Not Issued";
    }
//*******************************************************************************************
    
    
    public String getSeatMap(String flightNo) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber().equals(flightNo)) {
                return flights.get(i).getSeatMap();
            }
        }
        return "flight Not FOund";
    }

    
    //********************************************************************************************

    public String[] getFlightNos(){
        String[] planes=new String[3];    
        for(int i=0;i<flights.size();i++){
                planes[i]=flights.get(i).getFlightNumber();
            } 
        return planes;
    }
    //update
   public String updateSeat(String passportNo,String flightNo, String seatNo){
            int[] arr=new int[2];
            Flight f=new Flight();
            arr=f.splitSeats(seatNo);
            
            if(flights.get(searchFlight(flightNo)).seatsMap[arr[0]][arr[1]]=="X"){
                return "Seat is already Booked";
   }
            else{
                for(int i=0;i<flights.get(searchFlight(flightNo)).getSeats().size();i++){
//                    System.out.println(flights.get(0).getSeats().get(i).getPsngr().getPassNumber().equals(passportNo));
                     if(flights.get(searchFlight(flightNo)).getSeats().get(i).getPsngr().getPassNumber().equals(passportNo)){
                         flights.get(searchFlight(flightNo)).releaseSeat(flights.get(searchFlight(flightNo)).getSeats().get(i).getSeatNumber(), flights.get(searchFlight(flightNo)).getSeats().get(i));
                         System.out.println(flights.get(searchFlight(flightNo)).getSeats().get(i).getSeatNumber());
                         System.out.println(seatNo);
                         flights.get(searchFlight(flightNo)).getSeats().get(i).setSeatNumber(seatNo);
                         flights.get(searchFlight(flightNo)).seatsMap[arr[0]][arr[1]]="X";
                         return "Seat Changed Successfully";
                     }
                }
            }
       
       
       return "BoardingPass is not issued";
       
   }
//********************************************************************************************
    
    public boolean duplicate_check(String newPass) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassNumber().equals(newPass)) {
                return true;
            }
        }
        return false;
    }
   
//********************************************************************************************
   
    //flight search
    public int searchFlight(String s){   
        for(int i=0;i<getFlights().size();i++){
            if(getFlights().get(i).getFlightNumber().equals(s)){
                return i;
            }
        }
        System.out.println(0+" Search");
        return 0;
    }  
}//class ends

