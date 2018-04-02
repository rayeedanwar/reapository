public class BankAccount {

    private double balance;
    private String customerName;
    private String email;
    private String number;

    public BankAccount(double balance, String customerName, String email, String number) {

        this.balance = balance;
        this.customerName= customerName;
        this.email= email;
        this.number= number;

        System.out.println("Congratulations " + customerName + "!\nYou've opened a new account with £" + balance +"\nWe've saved your email: " + email + ". And your mobile: " + number);


    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

    public void setCustomerName(String name) {

        this.customerName = name;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setNumber(String number) {

        this.number = number;

    }

    public double getBalance(){

        return this.balance;

    }

    public String getCustomerName() {

        return  this.customerName;

    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }


    public void withdraw(double balance) {

        if(this.balance-balance>0) {
            this.balance -= balance;
            System.out.println("Withdrew £" + balance +"\nNew balance = £" + this.balance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double balance) {
        System.out.println("Balance before deposit: £" + this.balance);
        this.balance += balance;
        System.out.println("Balance after deposit: £" + this.balance);

    }


}
