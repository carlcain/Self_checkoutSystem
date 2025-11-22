package org.rocs.vra.Querys;

public enum QueryGet
{
    set1("select costumer, contact_number from userInfo"),
    set2("select Item_desc, Unit_price from Items"),
    set3("select * from Transport"),
    set4("select item_desc from Items"),
    set5("select trans_date from Transaction_form");

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
