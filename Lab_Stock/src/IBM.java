import java.util.ArrayList;
import java.util.List;

public class IBM extends StockAPI {
    private List<Double> bits;

    public IBM(String ID, double price, String description) {
        super(ID, price, description);
        bits = new ArrayList<>();
    }


    @Override
    public double getMetric() {

        double orginal = bits.get(0);
        double diff = 0;
        for (int i = 0; i < bits.size() - 1; i++) {
            //calculate the bits difference
            //Divide the gain or loss by the original price of the investment
            diff += (bits.get(i + 1) - bits.get(i)) / bits.get(i);

        }
        //find the avg difference
        return diff / bits.size();


    }

    @Override
    public void setBid(double bid) {
        setPrice(bid);
        bits.add(bid);
        //System.out.println(bits);
    }
}
