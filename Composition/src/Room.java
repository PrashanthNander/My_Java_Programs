public class Room {

    private Fan myFan;
    private Furniture myFurniure;

    public Room(Fan myFan, Furniture myFurniure) {
        this.myFan = myFan;
        this.myFurniure = myFurniure;
    }

    public void check(){
        this.getMyFan().displayFan();
    }

    public void fur() {
        this.myFurniure.maxWeight();
    }

    public Fan getMyFan() {
        return myFan;
    }

    public Furniture getMyFurniure() {
        return myFurniure;
    }

}
