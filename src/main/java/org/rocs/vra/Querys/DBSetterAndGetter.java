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
            default:
                throw new IllegalStateException("Unexpected value: " + query);
        }
    }
}
