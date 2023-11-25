//Encapsulation: Getter and Setter methods

class BankAccount {
    private int accountNo;
    private String accountHolderName;
    private String accountType;
    private long balance;

    {
        accountNo = 123456789;
        balance = 10000000;
    }


    // Getter and Setter methods
    public int getAccountNo() { //Accessor method
        return accountNo;
    }

    // public void setAccountNo(int accountNo) { //Mutator method
    //     this.accountNo = accountNo;
    // }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {    //Mutator method
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {    //Mutator method
        this.accountType = accountType;
    }

    public long getBalance() {
        return balance;
    }

    // public void setBalance(double balance) {    //Mutator method
    //     this.balance = balance;
    // }
}


public class Getter_Setter {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolderName("ABC");
        b.setAccountType("Savings");
        System.out.println("Account No: " + b.getAccountNo());
        System.out.println("Account Holder Name: " + b.getAccountHolderName());
        System.out.println("Account Type: " + b.getAccountType());
        System.out.println("Balance: " + b.getBalance());
    }
}

/*

Getter and Setter Methods: 
used to access and update the private data members of any class, anywhere.

*/