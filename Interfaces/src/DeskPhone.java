public class DeskPhone implements ITelephone {

    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialling " + phoneNumber + " now");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering call now");
            isRinging = false;
        } else {
            System.out.println("Cannot answer as the phone is not ringing");
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("Cannot power on as desk phones do not have Power button");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (this.phoneNumber == phoneNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
            System.out.println("Cannot call the phone or number not equal");
        }
        return isRinging;
    }
}
