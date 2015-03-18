
public class Dog extends Animal implements Talkable
{
    public Dog()
    {
        super("Fido");
    }
    public void talk()
    {
        System.out.println("Rufff Rufff.");
    }
}
