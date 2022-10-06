public class BankAccount {
    private double account;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccount(double account){
        this.account = account;
    }

    public double getAccount(){
        return this.account;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("You have deposited " + amount + " into " + this.account + " and the total balance is " + getBalance());
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Sorry there is not enough funds in the account");
        } else {
            this.balance -= amount;
        }
    }


}
