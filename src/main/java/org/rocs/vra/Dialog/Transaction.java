package org.rocs.vra.Dialog;

import java.util.Scanner;

public class Transaction
{
    private Scanner sc = new Scanner(System.in);
//    System.out.println();

    public void login()
    {
        System.out.println("====================");
        System.out.println("Login");
        System.out.println("Name: ");



        System.out.println("====================");
    }

    public void transac()
    {
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
