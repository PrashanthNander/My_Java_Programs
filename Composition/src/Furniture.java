public class Furniture {
    private String noOfLegs;
    private String typeOfWood;

    public Furniture(String noOfLegs, String typeOfWood) {
        this.noOfLegs = noOfLegs;
        this.typeOfWood = typeOfWood;
    }

    public void maxWeight() {
        System.out.println("It can hold maximum of 100 Kilos of weight");
    }


}
