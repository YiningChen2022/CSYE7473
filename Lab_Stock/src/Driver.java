public class Driver {


    public static void main(String[] args){
        //init stocks

        Tradable stock1 = new IBM("IBM", 131.15, "IBM Common Stock");
        Tradable stock2 = new Google("Google", 50, "Google Stock");

        stock1.setBid(131.22);
        stock1.setBid(132.01);
        stock1.setBid(131.00);
        stock1.setBid(130.99);
        stock1.setBid(130.19);
        stock1.setBid(130.59);
        System.out.println("Performace matric of IBM");
        System.out.println(stock1.getMetric());

        stock2.setBid(49);
        stock2.setBid(51.01);
        stock2.setBid(50.11);
        stock2.setBid(52.01);
        stock2.setBid(51.99);
        stock2.setBid(51.22);
        System.out.println("Performace matric of Google");
        System.out.println(stock2.getMetric());

        //1. implementation of two different algo to calculate the performance matrix

    }
}
