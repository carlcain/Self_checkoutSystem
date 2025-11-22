package org.rocs.vra.Querys;

public enum QueryGet
{
    set1("select costumer from userInfo"),
    set2("select costumer, contact_number from userInfo");

    private final String query;

    QueryGet(String query)
    {
        this.query = query;
    }

    public String getquery()
    {
        return this.query;
    }
}
