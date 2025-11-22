package org.rocs.vra.Profile;

// a class na nag store ng current costumer
public class CostumerLogin
{
    private static String costumerName;
    private static String costumerNumber;

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public void setCostumerNumber(String costumerNumber) {
        this.costumerNumber = costumerNumber;
    }

    public String getCostumerNumber() {
        return costumerNumber;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void Reset()
    {
        this.costumerName = null;
        this.costumerNumber = null;
    }
}
