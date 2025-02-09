package parkingLotModel;

public class Truck extends Vehicle{

	public static int _hourlyRate = 25;

	public Truck(String licensePlate, double requestedParkingTime, int spotNumber) {
		this.licensePlate = licensePlate;
		this.requestedParkingTime = requestedParkingTime;
		this.timeParked = format.format(date);
		this.calculatedBill = _hourlyRate*requestedParkingTime;
		this.spotNumber = spotNumber;
		this.vehicleType = "Truck";
	}

	@Override
	public String toString() {
		return "License plate: " + licensePlate + " --- Parking expiration: " + requestedParkingTime
				+  " hour(s) from " + timeParked + " --- Vehicle Type: Truck" + " --- Calculated Bill: "
				+ "$" +calculatedBill + " --- Spot Number: " + spotNumber;
	}

	public double calculateBill(){
		this.calculatedBill = _hourlyRate*this.requestedParkingTime;
		return calculatedBill;
	}

}
