package FreshCut;


public class Rectangle
{
    int width;
    int height;

    public Rectangle(int w, int h)
    {
        if(w > 0 && h > 0)
        {
            width = w;
            height = h;
        }
        else
        {
            width = 1;
            height = 1;
        }
    }

    public Rectangle(int s)
    {
        if(s > 0)
        {
            width = s;
            height = s;
        }
        else
        {
            width = 1;
            height = 1;
        }
    }
    
    public Rectangle()
    {
        width = 1;
        height = 1;
    }
    
    public String toString()
    {
        return "width: " + width + " height: " + height;
    }
    
    public boolean equals(Rectangle other)
    {
        if(this.width == other.width && this.height == other.height)
        {
            return true;
        }
        return false;
    }
    
    public int area()
    {
        
        return width * height;
    }
    
    public int perimeter()
    {
        return width * 2 + height * 2;
        
    }
    
    public boolean isSquare()
    {
        if(this.width == this.height)
        {
            return true;
        }
        return false;
    }
    
    
   

}
