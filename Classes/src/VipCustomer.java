public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    VipCustomer(){
        this("Aron",10000, "Aron@mail.com");
        System.out.println("Back to default");
    }
    VipCustomer(String name, String email) {
        this(name,5000, email);
        System.out.println("Back to second Constructor");

    }
    VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Printing");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
