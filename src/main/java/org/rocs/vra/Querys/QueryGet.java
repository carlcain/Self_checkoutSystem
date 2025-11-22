package org.rocs.vra.Querys;

public enum QueryGet
{
    set1("select costumer, contact_number from userInfo"),
    set2("select Item_desc, Unit_price from Items");

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
