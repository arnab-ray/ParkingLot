public class TwoWheeler extends Vehicle {
    private int rateOfParking;

    public TwoWheeler(String vehicleNumber, int rateOfParking) {
        super(vehicleNumber);
        this.rateOfParking = rateOfParking;
    }

    public int getRate() {
        return this.rateOfParking;
    }
}
