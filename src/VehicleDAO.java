import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class VehicleDAO {

    private String vehicleNumber;
    private String vehicleType;
    private long entryTime;
    private long exitTime;


    public VehicleDAO(Vehicle vehicle) {
        this.vehicleNumber = vehicle.getVehicleNumber();
        this.vehicleType = vehicle.getVehicleType().toString();
        this.entryTime = vehicle.getEntryTime();
        this.exitTime = vehicle.getExitTime();
    }

    public void saveToDB() {
        String query = "insert into Vehicle table vehicle_number, vehicle_type, entry_time, exit_time values " +
                this.vehicleNumber + "," + this.vehicleType + "," + this.entryTime +
                "," + this.exitTime;
        //Statement statement = new PreparedStatement().execute();
    }

    public void fetchFromDB() {
        //ResultSet resultSet = new PreparedStatement().execute();
    }
}
