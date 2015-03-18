
/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Animal implements Talkable
{
  public Elephant(String n)
  {
      super(n);
  }
  public void talk()
  {
      System.out.println("Errrrarrr");
   }
}
