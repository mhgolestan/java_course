public class Account {
    private String accountNumber;
    private double balance;
    private String customerNumber;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty constructor");
    }
    public Account(String accNumber, double initialBalance, String cusNumber, String email, String phone){
        this.accountNumber = accNumber;
        this.balance = initialBalance;
        this.customerNumber = cusNumber;
        this.customerEmailAddress = email;
        this.customerPhoneNumber = phone;

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Joon" + ", $" + this.balance + " daria");
    }
    public void withdraw(double withdrawlAmount){
        if (this.balance - withdrawlAmount < 0){
            System.out.println("RIDI");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("Gaidi Baba");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        customerPhoneNumber = customerPhoneNumber;
    }
}
