package FreshCut;

import java.util.*;
public class Notebook
{
    ArrayList<String> notes;
    
    public Notebook()
    {
        notes = new ArrayList<String>();
    }
    
    public void storeNotes( String s)
    {
       
        notes.add(s);
    }
    
    public void showNote( int noteIndex)
    {
        if(noteIndex >= 0 && noteIndex < notes.size())
        {
        System.out.println(notes.get(noteIndex));
    }
    else
    {
        System.out.println("You messed up Amit");
    }
    }
    
    public void removeNote(int removeThatJunk)
    {
        if(removeThatJunk >= 0 && removeThatJunk < notes.size())
        {
        notes.remove(removeThatJunk);
    }
    else
    {
        System.out.println("You done messed up");
    }
    }
    
    public void listNotes()
    {
        for(int i = 0; i < notes.size(); i++)
        {
            System.out.println(i +": " + notes.get(i));
        }
    }
}

