import java.util.ArrayList;
import java.util.List;

public class Google extends StockAPI {
    private static List<Double> bits;

    public Google(String ID, double price, String description) {
        super(ID, price, description);
        bits = new ArrayList<>();
    }


    @Override
    public int getMetric() {
        //to be implemented
        return 0;
    }

    @Override
    public void setBid(double bid) {
        bits.add(bid);
    }
}
