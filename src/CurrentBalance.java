/**
 * Created by atiqullah on 2017-07-27.
 */
public class CurrentBalance {
    private double debitBalance;
    private double creditBalance;

    public CurrentBalance(double debitBalance, double creditBalance){
        this.debitBalance = debitBalance;
        this.creditBalance = creditBalance;
    }

    public double getTotal(){
        return debitBalance + creditBalance;
    }

    public void display(){
        for(int i = 0; i < 36; i++) System.out.print("=");
        System.out.println();
        System.out.format("%-16s", "Current Balance\n");
        for(int i = 0; i < 36; i++) System.out.print("=");
        System.out.println();
        System.out.format("%-16s%10s%11s", "","Debit", "Credit\n");
        for(int i = 0; i < 36; i++) System.out.print("-");
        System.out.println();
        System.out.format("%16s%10.2f%9.2f", "", debitBalance, creditBalance);
        System.out.println();
        for(int i = 0; i < 36; i++) System.out.print("-");
        System.out.println();
        System.out.format("%-26s%9.2f", "Total:", getTotal());
        System.out.print("\n\n\n\n");

    }

    public double getDebitBalance() {
        return debitBalance;
    }

    public void setDebitBalance(int debitBalance) {
        this.debitBalance = debitBalance;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
}
