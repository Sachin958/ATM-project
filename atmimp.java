import PACKAGE_NAME.ATM;

import java.util.HashMap;
import java.util.Map;

public class atmimp implements atminterface{
    ATM atm = new ATM();
    Map<Double, String> msment = new HashMap<>();
    @Override
    public void viewbalance() {
        System.out.println("Available Balance :" + atm.getBalance());

    }

    @Override
    public void withdrawamount(double withdrawamount) {
        if(withdrawamount>=100){
            if(withdrawamount <= atm.getBalance()){
                msment.put(withdrawamount, "Amount withdrawn");
                System.out.println("collect your case " + withdrawamount);
                atm.setBalance(atm.getBalance() - withdrawamount);
                viewbalance();
            }else{
                System.out.println("you dont have enough amount ");
            }
        }
        else{
            System.out.println("Enter amount greater than 100");
        }
        }


    @Override
    public void depositamount(double depositamount) {
        msment.put(depositamount, "Amount deposited");
        System.out.println( "Rs"+depositamount+"Credited to A/c ...xxxx from: MBK/xxxxxxx.");
        atm.setBalance(atm.getBalance()+depositamount);
        viewbalance();
    }

    @Override
    public void ministatement() {
        for(Map.Entry<Double , String> m:msment.entrySet()){
            System.out.println(m.getKey()+ m.getValue());
        }

    }
}
