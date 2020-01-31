public class Receipt {

    private Vehicle vehicle;
    private long cost;
    //private long rate = 15;

    public String toString() {
        return "Vehicle number: " + vehicle.getVehicleNumber() + "; " + "Cost: " + cost + "; " + "Entry time: " +
                vehicle.getEntryTime() + "; " + "Exit time: " + vehicle.getExitTime();
    }

    public Receipt(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getCost() {
        return this.cost;
    }

    private int getMilliSecondsToHours() {
        return 1000*60*60;
    }
    public String generateReceipt() {
        this.setCost(this.vehicle.getRate() * (this.vehicle.getExitTime() - this.vehicle.getEntryTime())/getMilliSecondsToHours());

        return this.toString();
    }
}
