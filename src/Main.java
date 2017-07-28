
import org.omg.CORBA.Current;

import java.sql.*;

/**
 * Created by atiqullah on 2017-07-26.
 */
public class Main {

    public static void main(String[] args){
        CurrentBalance cb = null;
        ExpenseTable et = new ExpenseTable();
        Expense expense = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expense_tracker",
                    "user",
                    "password");
            Statement stmt=con.createStatement();
            ResultSet rs1 = stmt.executeQuery("select * from balance");
            while(rs1.next()){
                cb = new CurrentBalance(rs1.getDouble(2), rs1.getDouble(3));
            }
            ResultSet rs=stmt.executeQuery("select * from expenses;");
            while(rs.next()) {
                expense = new Expense(rs.getString(2),
                                      rs.getDate(3),
                                      rs.getDouble(4));
                et.addExpense(expense);
            }
            con.close();
        }catch(Exception e){ System.out.println(e);}
        cb.display();
        et.display();
    }

}
