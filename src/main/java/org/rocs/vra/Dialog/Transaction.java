package org.rocs.vra.Dialog;

import org.rocs.vra.ErrorExceptions.ExceptionMissinput;
import org.rocs.vra.Profile.CostumerLogin;
import org.rocs.vra.Querys.DBSetterAndGetter;
import org.rocs.vra.SystemLogic.Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction
{
    private Logic logic = new Logic();
    private CostumerLogin costumerLogin = new CostumerLogin();
    private Scanner sc = new Scanner(System.in);
    private DBSetterAndGetter dbSetterAndGetter = new DBSetterAndGetter();
//    System.out.println();

    public Transaction()
    {
        try
        {
            login();
        }
        catch (ExceptionMissinput e)
        {
            throw new RuntimeException(e);
        }
    }

    public void login()throws ExceptionMissinput
    {
        System.out.println("====================");
        System.out.println("Login");
        System.out.print("Name: ");
        String name = sc.nextLine();

        ArrayList<ArrayList<String>> input = dbSetterAndGetter.getInputs(1, null, null);
        boolean status = logic.Login(name, input);

        System.out.println("====================");

        if(status) // if log in is succesful
        {
            transac();
        }
    }

    public void transac() throws ExceptionMissinput
    {
        System.out.println("navigation: input some of the characters to navigate");
        System.out.println("Order: o");
        System.out.println("History: h");
        System.out.println("Profile: p"); //--
        System.out.println("Exit: e");// --
        System.out.print("choice: ");
        String choice = sc.next();
        choice = choice.toLowerCase(); // prevent error when user accedentaly use uppercase

        if(choice.equals("o")) // order
        {
            order();
        }
        else if(choice.equals("h")) // history
        {
            history();
        }
        else if(choice.equals("p")) // profile
        {
            profile();
        }
        else if(choice.equals("e")) // profile
        {
            sc.close();
        }
        else
        {
            throw new ExceptionMissinput("No input exist!");
        }
    }

    public void order()
    {
        System.out.println("====================");
        
        // dis only display items
        ArrayList<ArrayList<String>> input = dbSetterAndGetter.getInputs(2, null, null);

        for(int i = 0; i < input.size(); i++)
        {
            System.out.println("Item Name: "+input.get(i).get(0)+" | Price: "+input.get(i).get(1));
        }
    }

    public void history()
    {

    }

    public void profile() throws ExceptionMissinput {
        System.out.println("====================");
        System.out.println("Current Login");
        System.out.println("Name: "+costumerLogin.getCostumerName());
        System.out.println("Phone Numeber: "+costumerLogin.getCostumerNumber());
        System.out.println("====================");

        transac(); //go back to transact
    }
}
