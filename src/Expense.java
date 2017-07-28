import java.util.Date;

/**
 * Created by atiqullah on 2017-07-27.
 */
public class Expense {
    private String description;
    private Date date;
    private double amount;

    public Expense(String description, Date date, double amount){
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
