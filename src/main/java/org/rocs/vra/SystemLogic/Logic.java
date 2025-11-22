package org.rocs.vra.SystemLogic;

import java.util.ArrayList;

public class Logic
{
    public boolean Login(String UserInput, ArrayList<ArrayList<String>> DBinput)
    {
        for(int i = 0; i < DBinput.size(); i++)
        {
            String input = UserInput.trim();// remove space
            String dbinput = DBinput.get(i).get(0).trim();

            if(dbinput.equals(input))
            {
                System.out.println(UserInput);
                return true;

            }
//            System.out.println(DBinput.get(i));
        }
//        System.out.println(DBinput.size());
//        System.out.println(UserInput);
        return false;
    }
}
