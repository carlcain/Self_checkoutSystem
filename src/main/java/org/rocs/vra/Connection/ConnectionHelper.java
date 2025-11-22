package org.rocs.vra.Connection;


import java.sql.*;
import java.util.ArrayList;

public class ConnectionHelper
{
    public static String Oracle_Driver = "oracle.jdbc.driver.OracleDriver";

    // default
    // username: OwnerCheckoutSys
    // password: Changeme0
    public static String Url = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static String username = "OwnerCheckoutSys";
    public static String password = "Changeme0";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private PreparedStatement pstmt;

    public void getInfo(String Url, String username, String password)
    {
        this.Url = Url;
        this.username = username;
        this.password = password;
    }

    // method to connect to the Database (this method activate at the very start when application open)
    public static void getConnection(String getquery)
    {
        try
        {
            Class.forName(Oracle_Driver).newInstance();
            con = DriverManager.getConnection(Url, username, password);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Error Connecting to the Database: ", e);
        }
    }

    // note: I did not put any throws exception on the method because if I put them I need to put a similar throw on other methods that uses them
    // this method is for getting the result of a query
    // still needed to specify how many column mention in the query
    public ArrayList<ArrayList<String>> getQuery(String query, int columnNum)
    {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        try
        {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next())
            {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 1; i <= columnNum; i++)
                {
                    row.add(rs.getString(i));
//                    System.out.println("get query: "+rs.getString(i));
                }
                list.add(row);
            }

            // Clean up
            rs.close();
            stmt.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return list;
    }

    // for updating or inserting data in the DB
    public void setQuery(String query, String singleinput, ArrayList<String> inputs, int index)
    {
        try
        {
            pstmt = con.prepareStatement(query);

            for(int i = 1; i <= index; i++ )
            {
                // for single input
                if(singleinput != null)
                {
//                    System.out.println("set query: "+query);
                    pstmt.setString(i, singleinput);
                }

                // for multiple inputs
                if(inputs != null)
                {
                    pstmt.setString(i, inputs.get(i-1));
                    System.out.println(i-1);
                }
            }

            int rowsUpdated = pstmt.executeUpdate();
            //System.out.println("Rows updated: " + rowsUpdated);

            // Clean up
            rs.close();
            pstmt.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
