import java.util.ArrayList;
import java.util.List;

public class IBM extends StockAPI {
    private static List<Double> bits;

    public IBM(String ID, double price, String description) {
        super(ID, price, description);
        bits = new ArrayList<>();
    }



    @Override
    public int getMetric() {
        //to be discussed
        int count = bits.size();
        double sum = 0;
        for (double n : bits) {
            sum += n;
        }
        return (int) (sum / count - this.getPrice());

    }

    @Override
    public void setBid(double bid) {
        bits.add(bid);
        //System.out.println(bits);
    }
}
