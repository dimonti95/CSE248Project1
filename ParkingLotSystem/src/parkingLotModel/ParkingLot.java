package parkingLotModel;

import java.util.HashSet;

//Singleton Design Pattern

public class ParkingLot {

	private static ParkingLot _parkingLot;
	private HashSet<Vehicle> vehicleParkingSpots = new HashSet<Vehicle>();
	public static int totalParkingSpots = 100;
	public static int totalSpotsInUse = 0; // TEST

	public ParkingLot() {}

	public static ParkingLot createParkingLot() {
		if(_parkingLot == null) {
			_parkingLot = new ParkingLot();
			System.out.println("A parkingLot is created");
		} else {
			System.out.println("A parkingLot already exists, no need for a new one.");
		}
		return _parkingLot;
	}

	public HashSet<Vehicle> getVehicleParkingSpots() {
		return vehicleParkingSpots;
	}

	public boolean licensePlateExists(String licensePlate){
		for(Vehicle v : this.getVehicleParkingSpots()){
			if(v.licensePlate.equals(licensePlate)){
				return true;
			}
		}
		return false;
	}

	public boolean spotNumberExists(int spotNumber){
		for(Vehicle v : this.getVehicleParkingSpots()){
			if(v.spotNumber == spotNumber){
				return true;
			}
		}
		return false;
	}


	public Vehicle findVehicleByLicensePlate(String licensePlate){
		for(Vehicle v : this.getVehicleParkingSpots()){
			if(v.licensePlate.equals(licensePlate)){
				return v;
			}
		}
		return null;
	}


	public Vehicle findVehicleBySpotNumber(int spotNumber){
		for(Vehicle v : this.getVehicleParkingSpots()){
			if(v.spotNumber == spotNumber){
				return v;
			}
		}
		return null;
	}



}
