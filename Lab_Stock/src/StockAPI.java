public class StockAPI implements Tradable {


    private String ID;
    private double price;
    private String description;
    private static int[] bits;

    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
    }

    public StockAPI() {

    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "ID='" + ID + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' + ", current Metic: " + getMetric() + "\'" +
                '}';
    }



    public void setBid(double bid) {

    }


     public int getMetric() {
        return 0;
    }
}
