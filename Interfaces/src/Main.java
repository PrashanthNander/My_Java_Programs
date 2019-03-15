public class Main {
    public static void main(String[] args) {
        ITelephone telephone;
        telephone = new DeskPhone(123456);
        telephone.powerOn();
        telephone.callPhone(123456);
        telephone.answer();
    }
}
