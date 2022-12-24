package PACKAGE_NAME;
public class ATM {
    private double balance;
    private double depositeamount;
    private double withdrawamount;

    //default constructor
    public ATM(){

    }

    //getter setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositeamount() {
        return depositeamount;
    }

    public void setDepositeamount(double depositeamount) {
        this.depositeamount = depositeamount;
    }

    public double getWithdrawamount() {
        return withdrawamount;
    }

    public void setWithdrawamount(double withdrawamount) {
        this.withdrawamount = withdrawamount;
    }
}
