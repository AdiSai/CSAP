
public abstract class Animal
{
    private String name;

    public Animal(String n)
    {
        name = n;
    }

    public String toString() { return "Name: "+name; }

    public String getName() { return name; }
}
