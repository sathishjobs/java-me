package collectionExplore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

//        Theatre.Seat minSeat = Collections.max(List<Theatre.Seat> seatCopy)

        //        theatre.getSeats();
//
//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry , seat is taken");
//        }
//
//        if(theatre.reserveSeat(("H11"))){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        Collections.sort();
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list){
            System.out.println(" "+ seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================");
    }

}
