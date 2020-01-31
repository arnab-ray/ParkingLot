public class Vehicle {

    private String vehicleNumber;
    private VehicleType vehicleType;
    private long entryTime;
    private long exitTime;

    public int getRate() {
        return 0;
    }

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return this.getVehicleType();
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public long getEntryTime() {
        return this.entryTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public long getExitTime() {
        return this.exitTime;
    }

}
