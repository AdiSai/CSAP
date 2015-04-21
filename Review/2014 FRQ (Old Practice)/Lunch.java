public class Lunch
{
  public static void main(String[] args)
  {
    Sandwich cheesburger = new Sandwich("Cheeseburger", 2.75); //trio1
    Salad spinach = new Salad("Spinach Salad", 1.25); //trio1
    Drink soda = new Drink("Orange Soda", 1.25); //trio1
    Trio trio1 = new Trio(cheesburger, spinach, soda);
    System.out.println(trio1);
    
    Sandwich club = new Sandwich("Club Sandwich", 2.75); //trio2
    Salad coleslaw = new Salad("Coleslaw", 1.25); //trio2
    Drink cappuccino  = new Drink("Cappuccino", 3.50); //trio2
    Trio trio2 = new Trio(club, coleslaw, cappuccino);
    System.out.println(trio2);
  }  
}
