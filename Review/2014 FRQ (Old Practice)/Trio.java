import java.text.DecimalFormat;
import java.util.ArrayList;

public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    public Trio(Sandwich san, Salad sal, Drink d)
    {
        sandwich = san;
        salad = sal;
        drink = d;
    }
    
    public String getName()
    {
        return "Trio";
    }
    public double getPrice()
    {
        double sanPrice = sandwich.getPrice(); //sandwich price
        double salPrice = salad.getPrice(); //salad price
        double dPrice = drink.getPrice(); //drink price
        double priciest = 0.0; double secondPriciest = 0.0;
        if (sanPrice > salPrice)
        {
            priciest = sanPrice;
        }
        if ((!(priciest == 0.0)) && sanPrice > salPrice)
        {
            secondPriciest = sanPrice;
        }
        if (salPrice > dPrice)
        {
            priciest = salPrice;
        }
        if ((!(priciest == 0.0)) && salPrice > dPrice)
        {
            secondPriciest = salPrice;
        }
        if (dPrice > salPrice)
        {
            priciest = dPrice;
        }
        if ((!(priciest == 0.0)) && dPrice > salPrice)
        {
            secondPriciest = dPrice;
        }
        return priciest + secondPriciest;
    }
    
    public String toString()
    {
        return "" + getPrice();
    }
}
