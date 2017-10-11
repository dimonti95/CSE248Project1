package parkingLotSystem;

public class Car extends Vehicle{

	public static double _hourlyRate = 15;

	public Car(String licensePlate, double requestedParkingTime, int spotNumber) {
		this.licensePlate = licensePlate;
		this.requestedParkingTime = requestedParkingTime;
		this.timeParked = format.format(date);
		this.calculatedBill = _hourlyRate*requestedParkingTime;
		this.spotNumber = spotNumber;
	}

	@Override
	public String toString() {
		return "License plate: " + licensePlate + " --- Parking expiration: " + requestedParkingTime +
					" hour(s) from " + timeParked + " --- Vehicle Type: Car" + " --- Calculated Bill: "
							+ "$" + calculatedBill + " --- Spot Number: " + spotNumber;
	}

	@Override
	public double calculateBill() {
		this.calculatedBill = _hourlyRate*this.requestedParkingTime;
		return calculatedBill;
	}

}
