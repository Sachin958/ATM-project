
import java.util.*;
public class Main {
    public static void main(String[] args) {
        atminterface af = new atmimp();
        int atmnumber = 9784;
        int atmpin = 111;
        System.out.print("Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ATM number : ");
        int ATMnumber = sc.nextInt();
        System.out.print("Enter you ATM pin : ");
        int ATMpin = sc.nextInt();

        if((atmnumber==ATMnumber)&&(atmpin==ATMpin)){

            while(true){
                System.out.print("1. Available Balance\n 2. Withdraw Amount\n 3. Deposite Amount\n 4. View Ministatement\n 5. Exit" );
                System.out.print("Enter your operation : ");
                int oper = sc.nextInt();
                if(oper == 1 ){
                    af.viewbalance();
                }else if(oper == 2){
                    System.out.println("Enter your amount to withdraw");
                    double wdramount = sc.nextDouble();
                    af.withdrawamount(wdramount);

                }else if(oper == 3){
                    System.out.print("Enter amount to deposit");
                   double depositamount = sc.nextDouble();
                   af.depositamount(depositamount);

                }else if(oper == 4){
                   af.ministatement();
                }else if(oper == 5){
                    System.out.print("Collect your ATM Card ");
                    System.exit(0);
                }else{
                    System.out.print("please enter correct operation");
                }
            }
        }else{
            System.out.print("Please enter correct input : ");
            System.exit(0);
        }


    }
}