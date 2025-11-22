package org.rocs.vra;


import org.rocs.vra.Connection.ConnectionHelper;
import org.rocs.vra.Dialog.Transaction;
import org.rocs.vra.Querys.QueryGet;

//TODO:
/*
 * ability for user to log in <-
 * make user view profile
 */

public class Main
{
    public static void main(String[]args)
    {
        ConnectionHelper ch = new ConnectionHelper();
        ConnectionHelper.getConnection(QueryGet.set1.getquery());

        Transaction tran = new Transaction();
    }
}
