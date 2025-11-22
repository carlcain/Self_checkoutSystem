package org.rocs.vra.Querys;

import org.rocs.vra.Connection.ConnectionHelper;

import java.util.ArrayList;

public class DBSetterAndGetter
{
    private ConnectionHelper connectionHelper = new ConnectionHelper();

    public ArrayList<ArrayList<String>> getInputs(int query, String singleInput, String secondInput)
    {
        switch (query)
        {
            case 1: // get all users
                return connectionHelper.getQuery(QueryGet.set1.getquery(), 2);
            case 2:
                return connectionHelper.getQuery(QueryGet.set2.getquery(), 2);
            case 3:
                return connectionHelper.getQuery(QueryGet.set3.getquery(), 4);
            case 4:
                return connectionHelper.getQuery(QueryGet.set4.getquery()+" where Item_ID = "+singleInput+"'", 1);
            case 5:
                return connectionHelper.getQuery(QueryGet.set5.getquery()+" where trans_num = '"+singleInput+"'", 1);
            default:
                throw new IllegalStateException("Unexpected value: " + query);
        }
    }
}
