package org.rocs.vra.Querys;

public enum QueryGet
{
    set1("select costumer from userInfo;");


    private String query;

    QueryGet(String query)
    {
        this.query = query;
    }

    public String getDayNumber()
    {
        return this.query;
    }
}
