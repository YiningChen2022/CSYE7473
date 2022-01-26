public class Driver {


    public static void main(String[] args){
        //init stocks
        Tradable stock1 = new IBM("IBM", 131.15, "IBM Common Stock");
        Tradable stock2 = new Google("Google", 50, "Google Stock");

        stock1.setBid(20);
        stock1.setBid(30);
        System.out.println(stock1.getMetric());

        stock2.setBid(20);
        stock2.setBid(30);
        System.out.println(stock2.getMetric());

    }
}
