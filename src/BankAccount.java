import java.sql.SQLOutput;

public class BankAccount {
    private String account;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789",250, "Default name ", "default email", "default number" );
        // this used above calls a constructor within a constructor. Needs to be on the first line. so line 11 is calling line 20  with the default values  if this is called.
        // Need to be the same name as the  class
        // only called once  when the object is created.
        // The constructior can be overloaded as long as you have different parameters
        System.out.println("Empty constructor called ");

    }

    public BankAccount(String account, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called  ");
        this.account = account;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }


    public void setAccount(String account){
        this.account = account;
    }

    public String getAccount(){
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
