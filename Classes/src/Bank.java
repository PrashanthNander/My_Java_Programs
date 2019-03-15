public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    Bank(){
        this(10,15);

    }
    Bank(int a, int b) {
        System.out.println("a=" + a +" b="+ b);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    } public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance+=amount;
    }
    public double withDrawFunds(double amount) {

        if (amount > this.getBalance()) {
            return -1;
        } else {
            return this.balance-=amount;
        }

    }
}
