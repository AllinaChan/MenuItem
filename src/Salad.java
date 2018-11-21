public class Salad implements MenuItem{
    private double price;
    private String name;


    public Salad (double price, String name)
    {
        this.price=price;
        this.name=name;
    }
    @Override
    public double getPrice()
    {
        return this.price;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}
