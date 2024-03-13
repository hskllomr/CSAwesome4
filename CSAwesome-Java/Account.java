public class Account {
    private int balance;
    private String owner;

    // Create a constructor

    public Account(int  balance,String owner)
    {
        this.balance=balance;
        this.owner=owner;
    }

    public void deposit(int add)
    {
        balance=balance+add;
    }

    // create the deposit method

    // create the withdraw method

    public void withdraw(int substract)
    {
        balance=balance-substract;
        if(balance<=0)
        {
            balance=0;
        }
    }

    // create the toString method

    public String toString()
    {
        return " "+ owner + ": $"+ balance;

    }

    public static void main(String[] args) {
        System.out.println("Creating account with $500...");
        Account tomsAccount = new Account(500, "Tom");
        System.out.println(tomsAccount); // Should output "Tom: $500"
        System.out.println("Depositing $5...");
        tomsAccount.deposit(5);
        System.out.println(tomsAccount); // Should output "Tom: $505"
        System.out.println("Withdrawing $10...");
        tomsAccount.withdraw(10);
        System.out.println(tomsAccount); // Should output "Tom: $495"
        System.out.println("Withdrawing $500...");
        tomsAccount.withdraw(500);
        System.out.println(tomsAccount); // should output "Tom: $0"
    }
}