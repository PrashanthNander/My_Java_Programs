public class Fan {
    private int speed;
    private String color;

    public Fan(int speed, String color) {
        this.speed= speed;
        this.color = color;
    }

    public void displayFan() {
        System.out.println("Displaying Fan here");
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
