public class Vehicle {
    private String vehicleTyp;
    private String size;

    public Vehicle() {

    }
    public Vehicle(String vehicleTyp, String  size) {
        this.vehicleTyp = vehicleTyp;
        this.size = size;
    }

    public void display() {
        System.out.println("Inside Main Display Method");
    }
    public void mainMeth() {
        System.out.println(" This is unique method, specific to Vehicle class");
    }

    public String getVehicleTyp() {
        return vehicleTyp;
    }

    public String getSize() {
        return size;
    }


}
