package org.rocs.vra;


import org.rocs.vra.Connection.ConnectionHelper;
import org.rocs.vra.Dialog.Transaction;

//TODO:
/*
 *
 */

public class Main
{
    public static void main(String[]args)
    {
        ConnectionHelper ch = new ConnectionHelper();
        ConnectionHelper.getConnection();

        Transaction tran = new Transaction();

    }
}
