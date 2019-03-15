public class Benz extends Car {
    private String carColour;
    private String carModel;

    public Benz(String carColour, String carModel) {
        this.carColour = carColour;
        this.carModel = carModel;
    }

    public void multiDisplay() {
        System.out.println("Multiple Inheritance");
    }
    public String getCarColour() {
        return carColour;
    }

    public String getCarModel() {
        return carModel;
    }
}
