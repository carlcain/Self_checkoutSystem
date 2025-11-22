package org.rocs.vra.SystemLogic;

import org.rocs.vra.Profile.CostumerLogin;
import org.rocs.vra.Querys.DBSetterAndGetter;

import java.util.ArrayList;

public class Logic
{
    private CostumerLogin costumerLogin = new CostumerLogin();
    private DBSetterAndGetter dbSetterAndGetter = new DBSetterAndGetter();

    public boolean Login(String UserInput, ArrayList<ArrayList<String>> DBinput)
    {
        for(int i = 0; i < DBinput.size(); i++)
        {
            String input = UserInput.trim();// remove space
            String dbinput = DBinput.get(i).get(0).trim();

            if(dbinput.equals(input))
            {
//                System.out.println(UserInput);
//                System.out.println("input"+DBinput);

//                System.out.println(DBinput.get(0).get(0));
//                System.out.println(DBinput.get(1).get(0));

               costumerLogin.setCostumerName(UserInput);
               costumerLogin.setCostumerNumber(DBinput.get(i).get(1));

                return true;
            }
//            System.out.println(DBinput.get(i));
        }
//        System.out.println(DBinput.size());
//        System.out.println(UserInput);
        return false;
    }

    public void History(ArrayList<ArrayList<String>> DBinput)
    {
        ArrayList<String> ItemName = new ArrayList<>();
        ArrayList<String> TransDate = new ArrayList<>();

        for(int i = 0; i < DBinput.size(); i++)
        {
//            System.out.println(DBinput.get(i).get(0));
            ArrayList<ArrayList<String>>input1 = dbSetterAndGetter.getInputs(4, DBinput.get(i).get(0), null);
//            ItemName.add(input1.get(0).get(0));
            System.out.println(input1.get(0).get(0));

//            System.out.println(DBinput.get(i).get(2));
            ArrayList<ArrayList<String>>input2 = dbSetterAndGetter.getInputs(5, DBinput.get(i).get(2), null);
//            TransDate.add(input2.get(0).get(0));
            System.out.println(input2.get(0).get(0));
        }

        System.out.println(ItemName.size());
        System.out.println(TransDate.size());
    }
}
