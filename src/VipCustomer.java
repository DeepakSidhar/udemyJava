public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default",0.00,"default");
        System.out.println("This is the first constructor");
    }
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit,"default");

    }
    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
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
