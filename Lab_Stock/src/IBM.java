import java.util.ArrayList;
import java.util.List;

public class IBM extends StockAPI {
    private List<Double> bits;

    public IBM(String ID, double price, String description) {
        super(ID, price, description);
        bits = new ArrayList<>();
    }


    @Override
    public int getMetric() {
        int count = bits.size();
        double sum = 0;
        for (double n : bits) {
            sum += n;
        }
        return (int) (sum / count - this.getPrice());

    }

    @Override
    public void setBid(double bid) {
        setPrice(bid);
        bits.add(bid);

    }
}
