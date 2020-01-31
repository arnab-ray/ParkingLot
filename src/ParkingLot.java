public class ParkingLot {
    private LotDetails[] lots;

    public ParkingLot(int size) {
        this.lots = new LotDetails[size];

        for(int i = 0; i < 2*(size/3); i++) {
            lots[i] = new LotDetails(i, VehicleType.FOUR_WHEELER);
        }

        for(int i = 2*(size/3); i < size; i++) {
            lots[i] = new LotDetails(i, VehicleType.TWO_WHEELER);
        }
    }

    public void addVehicleToLot(String vehicleNumber, String vehicleType) {
        long time = System.currentTimeMillis();
        for(LotDetails lot : this.lots) {
            if(lot.isFree() && lot.isCompatibleType(VehicleType.valueOf(vehicleType))) {
                Vehicle vehicle = new Vehicle(vehicleNumber);
                vehicle.setVehicleType(VehicleType.valueOf(vehicleType));
                vehicle.setEntryTime(time);

                lot.setVehicle(vehicle);
                break;
            }
        }
    }

    public String removeVehicleFromLot(String vehicleNumber) {
        for(LotDetails lot : this.lots) {
            if(lot.getVehicle() != null && lot.getVehicle().getVehicleNumber() != null
                    && lot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {
                long exitTime = System.currentTimeMillis();
                lot.getVehicle().setExitTime(exitTime);
                Receipt receipt = new Receipt(lot.getVehicle());
                lot.removeVehicle();
                return receipt.generateReceipt();
            }
        }
        return null;
    }

    public void printCurrentStateOfLot() {
        for(LotDetails lot : this.lots) {
            if(lot.isFree())
                System.out.print(" | ");
            else
                System.out.print(lot.getVehicle().getVehicleNumber() + " ");
        }
        System.out.println();
    }
}
