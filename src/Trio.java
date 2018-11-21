public class Trio implements MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }

    public String getName()
    {
        return this.sandwich.getName()+"/"+this.salad.getName()+"/"+this.drink.getName();
    }

    public double getPrice()
    {
        double a =this.sandwich.getPrice();
        double b =this.salad.getPrice();
        double c=this.drink.getPrice();

        double[] prices = new double[3];
        prices[0]=a;
        prices[1]=b;
        prices[2]=c;

        double minABC= prices[0];
        double maxAB=Math.max(a,b);
        double maxABC=Math.max(maxAB,c);

        for (int i =0; i<prices.length; i++)
        {
            if(prices[i]<minABC)
            {
                minABC=prices[i];
            }
        }
        return a+b+c-minABC;
    }
}
