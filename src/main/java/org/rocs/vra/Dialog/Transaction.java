package org.rocs.vra.Dialog;

import org.rocs.vra.Querys.DBSetterAndGetter;
import org.rocs.vra.SystemLogic.Logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction
{
    private Logic logic = new Logic();
    private Scanner sc = new Scanner(System.in);
    private DBSetterAndGetter dbSetterAndGetter = new DBSetterAndGetter();
//    System.out.println();

    public Transaction()
    {
        login();
    }

    public void login()
    {
        System.out.println("====================");
        System.out.println("Login");
        System.out.print("Name: ");
        String name = sc.nextLine();

        ArrayList<ArrayList<String>> input = dbSetterAndGetter.getInputs(1, null, null);

        boolean status = logic.Login(name, input);

        if(status)
        {
            transac();
        }

        System.out.println("====================");
    }

    public void transac()
    {
        System.out.println("====================");
        System.out.println("navigation: input some of the characters to navigate");
        System.out.println("Order: o");
        System.out.println("History: h");
        System.out.println("Profile: p");
        System.out.print("choice: ");
        String choice = "";
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
        else
        {

        }

        sc.close();
    }

    public void order()
    {

    }

    public void history()
    {

    }

    public void profile()
    {

    }
}
