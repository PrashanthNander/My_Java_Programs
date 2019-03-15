public class Main {

    public static void main(String[] args) {

        Fan myFanhere = new Fan(10,"Yellow");
        Furniture myFur =  new Furniture("6", "Sandalwood");
        Room myRoom = new Room(myFanhere, myFur);
        myRoom.getMyFan().displayFan();
        myFur.maxWeight();
    }
}
