import java.util.ArrayList;
import java.util.List;

public class Google extends StockAPI {
    private List<Double> bits;

    public Google(String ID, double price, String description) {
        super(ID, price, description);
        bits = new ArrayList<>();
    }


    @Override
    public int getMetric() {
        //Google
        double diff = 0;
        for (int i = 0; i < bits.size() - 1; i++) {
            diff += bits.get(i + 1) - bits.get(i);
        }
        //Divide the gain or loss by the original price of the investment
        return (int) (diff);


    }

    @Override
    public void setBid(double bid) {
        setPrice(bid);
        bits.add(bid);
    }
}
