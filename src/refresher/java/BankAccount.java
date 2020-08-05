package refresher.java;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public long getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        System.out.println(this.balance + " before deposit");
        System.out.println("Deposit amount: " + deposit);
        this.balance += deposit;
        System.out.println("Final Balance: " + this.balance);
    }

    public void withdrawFunds(double withdraw){
        System.out.println(this.balance + " before withdraw");
        if (withdraw > this.balance){
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Withdraw amount: " + withdraw);
            this.balance -= withdraw;
            System.out.println("Final Balance: " + this.balance);
        }
    }

}
