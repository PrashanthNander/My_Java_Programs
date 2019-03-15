public class Car extends Vehicle{
    String companyName;
    String carClass;


    public Car(String companyName, String carClass ) {
        super("4Wheeler", "LMV");
        this.companyName =  companyName;
        this.carClass = carClass;
    }
    public void carDisplay () {
        System.out.println("Inside Car class");
    }

    @Override
    public void display() {
        System.out.println("Insidfe Over ridden Display Meth");
        super.display();
    }
    public String getCompanyName() {
        return companyName;
    }

    public String getCarClass() {
        return carClass;
    }
}
