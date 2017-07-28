import javafx.scene.control.cell.TextFieldTableCell;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by atiqullah on 2017-07-27.
 */
public class ExpenseTable {
    private List<Expense> expenses;
    private int size;

    public ExpenseTable(){
        expenses = new LinkedList<Expense>();
        size = 0;
    }

    public void addExpense(Expense e){
        expenses.add(e);
        size++;
    }

    public void userInputInsert(){
        System.out.println("\n\n");
        Scanner scan = new Scanner(System.in);
        String description;
        double amount;
        System.out.println("Please enter a description: ");
        description = scan.next();
        System.out.println("Please enter an amount: ");
        amount = scan.nextDouble();
        Date date = new Date();
        Expense e = new Expense(description, date, amount);
        System.out.println("Are you sure you want to add: ");
        System.out.println(description + " " + date.toString() + " " + amount);
        System.out.println("Press y or n");
        String set = scan.next();
        if(set.equals("y")) {
            expenses.add(e);
        }
    }

    //TODO: Finish this method
    public void removeExpenseByDescription(){}

    public void display(){
        for(int i = 0; i < 89; i++) System.out.print("=");
        System.out.println();
        System.out.format("%-30s%-20s%-20s%-20s", "Expense", "Date", "Amount", "New Balance");
        System.out.println();
        for(int i = 0; i < 89; i++) System.out.print("=");
        System.out.println();
        for(int i = 0; i < expenses.size(); i++) {
            System.out.format("%-30s%-20s%-20s%-20s", expenses.get(i).getDescription(), expenses.get(i).getDate().toString()/*.substring(0, 10)*/, expenses.get(i).getAmount(), 20);
            System.out.println();
        }

        for(int i = 0; i < 89; i++) System.out.print("-");
        System.out.println("\n\n\n\n");
    }

}
