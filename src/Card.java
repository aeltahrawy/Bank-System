public class Card {
    String Name;
    int Age;
    int ID;
    int Balance;
    int deposit;
    int withdraw;

    public Card(String name, int age, int ID, int balance) {
        Name = name;
        Age = age;
        this.ID = ID;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getID() {
        return ID;
    }

    public int getBalance() {
        return Balance;

    }

    public void setDeposit(int deposit) {
        if(deposit > 0) {
            this.deposit = deposit;
            Balance = deposit + Balance;
            System.out.println(deposit + " has been deposited to your balance");
            System.out.println("Your new balance is " + getBalance());
            System.out.println("");
        }
        else {
            System.out.println("That is not possible.");
        }

    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
        if (withdraw > Balance) {
            System.out.println("Insufficient amount");
            System.out.println("");

        } else if (withdraw <= 1500) {
            Balance = Balance - withdraw;
            System.out.println(withdraw + " has been withdrawn from your balance");
            System.out.println("Your new balance is " + getBalance());
            System.out.println("");

        } else {
            System.out.println("Permission denied. You can withdraw a maximum amount of 1500");
        }

    }
}

