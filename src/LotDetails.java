public class LotDetails {

    private int lotId;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public LotDetails(int lotId, VehicleType vehicleType) {
        this.lotId = lotId;
        this.vehicleType = vehicleType;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public int getLotId() {
        return this.lotId;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return this.getVehicleType();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public boolean isFree() {
        return this.vehicle == null;
    }

    public boolean isCompatibleType(VehicleType vehicleType) {
        return this.vehicleType == vehicleType;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }
}
