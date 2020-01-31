import java.util.Scanner;

public class ParkingLotDriver {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(25);



        while(true) {

            System.out.println("Please enter type of vehicle");
            String vehicleType = in.next();
            if(!vehicleType.equalsIgnoreCase(VehicleType.TWO_WHEELER.toString()) &&
                    !(vehicleType.equalsIgnoreCase(VehicleType.FOUR_WHEELER.toString()))) {
                System.out.println("Vehicle type can only be TWO_WHEELER or FOUR_WHEELER");
                continue;
            }

            System.out.println("Please enter number of vehicle");
            String vehicleNumber = in.next();

            System.out.println("Please enter type of action");
            String action = in.next();

            if(action.equalsIgnoreCase(ActionAllowed.ENTRY.toString())) {
                parkingLot.addVehicleToLot(vehicleNumber, vehicleType);
                parkingLot.printCurrentStateOfLot();
            } else if (action.equalsIgnoreCase(ActionAllowed.EXIT.toString())) {
                System.out.println(parkingLot.removeVehicleFromLot(vehicleNumber));
                parkingLot.printCurrentStateOfLot();
            } else {
                System.out.println("Action can only be ENTRY or EXIT");
            }
        }
    }
}
