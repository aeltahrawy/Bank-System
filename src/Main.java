import java.util.Scanner;

public class Main {
    static int answer;
    static String answer1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Card cardA = new Card("Abood", 23, 1998, 5000);
        Card cardD = new Card("Dana", 24, 1997, 5000);
        System.out.println("Hello, please insert your ID");
        answer = scan.nextInt();


        if (answer == cardA.getID()) {
            System.out.println("Welcome Abood, What would you like to do?");


            while (true) {
                System.out.println("Deposit, Withdraw, CheckBalance, Exit");
                answer1 = scan.next();

                if (answer1.equals("Deposit")) {
                    System.out.println("Please insert the amount to deposit.");
                    answer = scan.nextInt();
                    cardA.setDeposit(answer);


                } else if (answer1.equals("Withdraw")) {
                    System.out.println("Please insert the amount to withdraw.");
                    answer = scan.nextInt();
                    cardA.setWithdraw(answer);

                } else if (answer1.equals("CheckBalance")) {
                    System.out.println(cardA.getBalance());

                } else if (answer1.equals("Exit")) {
                    System.out.println("Thank you and have a nice day!");
                    break;
                } else {
                    System.out.println("Not recognized ID");


                }
            }
        } else if (answer == cardD.getID()) {
            System.out.println("Welcome Dana, What would you like to do?");


            while (true) {
                System.out.println("Deposit, Withdraw, CheckBalance, Exit");
                answer1 = scan.next();

                if (answer1.equals("Deposit")) {
                    System.out.println("Please insert the amount to deposit.");
                    answer = scan.nextInt();
                    cardA.setDeposit(answer);


                } else if (answer1.equals("Withdraw")) {
                    System.out.println("Please insert the amount to withdraw.");
                    answer = scan.nextInt();
                    cardA.setWithdraw(answer);

                } else if (answer1.equals("CheckBalance")) {
                    System.out.println(cardA.getBalance());

                } else if (answer1.equals("Exit")) {
                    System.out.println("Thank you and have a nice day!");
                    break;
                } else {
                    System.out.println("Not recognized ID");


                }
            }
        } else {
            System.out.println("Wrong ID");
        }
    }
}







