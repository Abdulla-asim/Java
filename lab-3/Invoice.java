public class Invoice {
    String pID;
    String pDesc;
    int pQty;
    double pricePerItem;

    Invoice(String pID, String pDesc, int pQty, double pricePerItem) {
        if (pQty >= 0 && pricePerItem >= 0)
        {
            this.pQty = pQty;
            this.pricePerItem = pricePerItem;
        }
        else 
        {
            this.pQty = 0;
            this.pricePerItem = 0.0;
        }
            this.pID = pID;
            this.pDesc = pDesc;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pQty >= 0)
            this.pricePerItem = pricePerItem;
        else 
            this.pricePerItem = 0;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }
    
    public void setpQty(int pQty) {
        if(pQty >= 0)
            this.pQty = pQty;
        else 
            this.pQty = 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    
    public String getpDesc() {
        return pDesc;
    }

    public String getpID() {
        return pID;
    }

    public int getpQty() {
        return pQty;
    }

    double getInvoiceAmount() {
        return pQty * pricePerItem;
    }
}
