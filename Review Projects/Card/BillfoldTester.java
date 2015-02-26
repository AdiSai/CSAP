/**
 * Write a description of class BillfoldTester here.
 * @author (Adithya Sairamachandran) 
 * @version (2/26/15)
 */
public class BillfoldTester
{
    public static void main(String[] args)
    {
        String name = "Adi";
        Billfold b = new Billfold();
        Card c1 = new CallingCard(name, 123456);
        Card c2 = new DriversLicence(name, 2014);
        Card c3 = new IDCard(name, "0a0b0c0d");
        b.addCard(c1);
        b.addCard(c2);
        System.out.println(b.formatCards());
        System.out.println("DriversLicence isExpired(): " + ((DriversLicence)c2).isExpired(c2));
        System.out.println();
        System.out.println(c1 + "\n");
        System.out.println(c2);
    }
}