package main.java.com.rental.interfaces;

import main.java.com.rental.agency.RentalAgency;
import main.java.com.rental.model.Car;
import main.java.com.rental.model.Motorcycle;
import main.java.com.rental.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        initializeVehicles(agency);

        // Display available vehicles
        agency.displayAvailableVehicles();
    }

    private static void initializeVehicles(RentalAgency agency) {
        List<VehicleData> vehicleDataList = new ArrayList<>();
        vehicleDataList.add(new VehicleData("GA-364-22", "Hyundai", "Santa-Fe", 200.0, "Car", 4));
        vehicleDataList.add(new VehicleData("GE-3621-24", "Toyota", "Yaris", 50.0, "Car", 4));
        vehicleDataList.add(new VehicleData("GE-3921-24", "Cardillac", "XT4", 350.0, "Car", 4));
        vehicleDataList.add(new VehicleData("GA-364-22", "Mercedes-Benz", "GLS 63 S", 400.0, "Car", 4));
        vehicleDataList.add(new VehicleData("AS-1-23", "Honda", "Civic", 120.0, "Car", 4));
        vehicleDataList.add(new VehicleData("GA-132-20", "Yamaha", "Sportster", 60.0, "Motorcycle", false));
        vehicleDataList.add(new VehicleData("GR-732-22", "Honda", "PCX 125", 80.0, "Motorcycle", true));
        vehicleDataList.add(new VehicleData("GM-032-24", "Yamaha", "FZ6", 90.0, "Motorcycle", false));
        vehicleDataList.add(new VehicleData("GU-378-23", "Harley-Davidson", "Sportster", 30.0, "Motorcycle", false));
        vehicleDataList.add(new VehicleData("GR-13-24", "kTM", "SX-F 350 2023", 90.0, "Motorcycle", true));
        vehicleDataList.add(new VehicleData("GR-1332-21", "Yamaha", "Majest 250", 40.0, "Motorcycle", false));
        vehicleDataList.add(new VehicleData("GA-2212-24", "Ford", "F-150", 80.0, "Truck", 24000.0));
        vehicleDataList.add(new VehicleData("GE-3662-23", "Ford", "F-350", 80.0, "Truck", 32000.0));
        vehicleDataList.add(new VehicleData("GE-8662-22", "GMC", "Sierra 1500", 80.0, "Truck", 45000.0));
        vehicleDataList.add(new VehicleData("GM-2673-20", "Toyota", "Tacoma", 80.0, "Truck", 54000.0));

        for (VehicleData data : vehicleDataList) if (data.getType().equals("Car")) {
                        agency.addVehicle(new Car(data.getLicensePlate(), data.getBrand(), data.getModel(), data.getRentalPrice(), data.getSeats()));
                    } else if (data.getType().equals("Motorcycle")) {
                        agency.addVehicle(new Motorcycle(data.getLicensePlate(), data.getBrand(), data.getModel(), data.getRentalPrice(), data.isHasSidecar()));
                    } else if (data.getType().equals("Truck")) {
                        agency.addVehicle(new Truck(data.getLicensePlate(), data.getBrand(), data.getModel(), data.getRentalPrice(), data.getPayloadCapacity()));
                    }
                }
            }
        
            class VehicleData {
        private String licensePlate;
        private String brand;
        private String model;
        private double rentalPrice;
        private String type;
        private int seats;
        private boolean hasSidecar;
        private double payloadCapacity;

        public VehicleData(String licensePlate, String brand, String model, double rentalPrice, String type, int seats) {
            this.licensePlate = licensePlate;
            this.brand = brand;
            this.model = model;
            this.rentalPrice = rentalPrice;
            this.type = type;
            this.seats = seats;
        }

        public VehicleData(String licensePlate, String brand, String model, double rentalPrice, String type, boolean hasSidecar) {
            this.licensePlate = licensePlate;
            this.brand = brand;
            this.model = model;
            this.rentalPrice = rentalPrice;
            this.type = type;
            this.hasSidecar = hasSidecar;
        }

        public VehicleData(String licensePlate, String brand, String model, double rentalPrice, String type, double payloadCapacity) {
            this.licensePlate = licensePlate;
            this.brand = brand;
            this.model = model;
            this.rentalPrice = rentalPrice;
            this.type = type;
            this.payloadCapacity = payloadCapacity;
        }

        public String getType() {
            return type;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public double getRentalPrice() {
            return rentalPrice;
        }

        public int getSeats() {
            return seats;
        }

        public boolean isHasSidecar() {
            return hasSidecar;
        }

        public double getPayloadCapacity() {
            return payloadCapacity;
        }
    }
