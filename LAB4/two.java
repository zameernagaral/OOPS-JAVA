//Develop a Java program to create an interface ParkingCharge containing the methods calculateCharge() and displayParkingDetails(). Create a class VehicleParking with members Vehicle Number, Vehicle Type, and Parking Hours. Derive the classes TwoWheeler [and] FourWheeler from VehicleParking and implement the [interface]. Calculate the parking charge as follows: For TwoWheeler, [charge Rs. 20] per hour for the first two hours and Rs. 10 per [each addit]ional hour. For FourWheeler, charge Rs. 50 per ho[ur for the first two ho]urs and Rs. 30 per hour for each additional hour. [Display details] and total parking charge. Demonstrate runtime [polymorphism using a] ParkingCharge reference.

interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    protected String vehicleNumber;
    protected String vehicleType;
    protected int parkingHours;

    public VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    public TwoWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20;
        } else {
            return (2 * 20) + (parkingHours - 2) * 10;
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    public FourWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50;
        } else {
            return (2 * 50) + (parkingHours - 2) * 30;
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Charge: Rs. " + calculateCharge());
    }
}

public class two {
    public static void main(String[] args) {
        ParkingCharge vehicle1 = new TwoWheeler("TN 01 AB 1234", 3);
        ParkingCharge vehicle2 = new FourWheeler("MH 02 CD 5678", 4);

        System.out.println("--- Two Wheeler Parking Details ---");
        vehicle1.displayParkingDetails();
        System.out.println();

        System.out.println("--- Four Wheeler Parking Details ---");
        vehicle2.displayParkingDetails();
    }
}