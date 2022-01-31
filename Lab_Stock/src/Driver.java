public class Driver {


    public static void main(String[] args) {
        //init stocks

        Tradable stock1 = new IBM("IBM", 131.15, "IBM Common Stock");
        Tradable stock2 = new Google("Google", 50, "Google Stock");
        double[] iBMBid = new double[]{130.22,139.01,131.99,112.19,113.59};
        double[] googleBid = new double[]{33.22,39.01,51.99,23.19,49.59};


        simulate(stock1, iBMBid);
        simulate(stock2, googleBid);

    }

    private static void simulate(Tradable stock, double[] bids) {
        System.out.println(stock);
        for (int i = 0; i < bids.length; i++) {
            stock.setBid(bids[i]);
            System.out.println("After bid: " + bids[i] + ", get metric: " + stock.getMetric());
        }
    }
}
