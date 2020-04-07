package classes;

import GUI.KaitekiAirlineGUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @autho hadi
 */


/*
Class that implements the requirements of Flights

*/
public class Flight {

    private String flightNumber;
    private String origin;
    private String destination;
    public String seatsMap[][] = new String[20][3];
    private static ArrayList<BoardingPass> seats;
    static {
        seats = new ArrayList<>();
    }
    
    

//    Constructors
    public Flight(){
        this.pop();
    }

    public Flight(String flightNumber, String origin, String destination) {
        
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.pop();
    }
    

//     Setters and getter of Flight class
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public static ArrayList<BoardingPass> getSeats() {
        return seats;
    }

    public static void setSeats(BoardingPass seats1) {
        seats.add(seats1);
    }
    
    /************************Required Methods of Flight ***************************/
    
    //Function that will be used for populating seating maps with dashes
    public void pop() {
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 3; c++) {
                seatsMap[r][c] = "-";
            }
        }
    }

//    Method for getting empty seats and assigning seat randomly
    public String getEmptySeat() {
        boolean flag = false;
        int r = 0;
        int c = 0;
        if (full_flight() == true) {
            return "NoSeats";
        } else {
            while (flag == false) {
                Random rand = new Random();
                r = rand.nextInt(20);
                c = rand.nextInt(3);
                if (seatsMap[r][c].equals("-")) {
                    flag = true;
                }
            }
        }
        char[] a = {'A', 'B', 'C'};
        String seatId = String.valueOf(r+1) + String.valueOf(a[c]);
  //      System.out.println(seatId);
        return seatId;
    }

    /*mehtod for checking the flight seats 
    availability either seats are available or not
    */
    public boolean full_flight() {
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 3; c++) {
                if (seatsMap[r][c].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    //Mehtod that return the Seat Map
    String getSeatMap() {
        String map = "\tA\tB\tC\n1";
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 3; c++) {
                map+="\t";
                map+=seatsMap[r][c];
                map += "";
            }
            if(r==19)
                continue;
            map += "\n"+(r+2);
        }
        return map;
    }

  //Custom splitter method for spliting seats name
    public int[] splitSeats(String seatNo) {
        int[] loc = new int[2];
        String number = "";
        String letter = "";
        for (int i = 0; i < seatNo.length(); i++) {
            char a = seatNo.charAt(i);
            if (Character.isDigit(a)) {
                number = number + a;
            } else {
                letter = letter + a;
            }
        }
        loc[0] = Integer.parseInt(number)-1;
        loc[1] = 0;
        if (letter.equals("A")) {
            loc[1] = 0;
        } else if (letter.equals("B")) {
            loc[1] = 1;
        } else {
            loc[1] = 2;
        }
        return loc;
    }

//   release seat method from boarding pass and seats
    public boolean releaseSeat(String seatNo, BoardingPass bp) {
        int[] arr = new int[2];
        arr = splitSeats(seatNo);
        for (int i = 0; i < seats.size(); i++) {
            if (bp.getSeatNumber().equals(seatNo) && seats.get(i).getSeatNumber().equals(seatNo)) {
                bp.getFlight().seatsMap[arr[0]][arr[1]] = "-";
//                seats.remove(i);
                return true;
            }
        }
        return false;
    }

//   Method for Assigning an Empty seat to Passenger
    public boolean assignSeat(BoardingPass bp) {
        int[] arr = new int[2];
        String emptySeat = getEmptySeat();
        if (emptySeat.equals("NoSeats")) {
            return false;
        } else {
            bp.setSeatNumber(emptySeat);
            arr = splitSeats(emptySeat);
            seatsMap[arr[0]][arr[1]] = "X";
            //seats.add(bp);
        }
        return true;
    }

    
    //Method for assiging particular seat number to particular boarding pass()Requested Seat)
    public boolean assignSeat(String seatNo, BoardingPass bp) {
        int[] arr = new int[2];
        arr = splitSeats(seatNo);
        if (seatsMap[arr[0]][arr[1]].equals("X")) {
            return false;
        } else {
            bp.setSeatNumber(seatNo);
            seats.add(bp);
            seatsMap[arr[0]][arr[1]] = "X";
        }
        return true;
    }  
}
//flight list ends
