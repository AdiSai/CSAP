package FreshCut;



public class NotebookTester
{
 public static void main( String [] args)
 {
     Notebook journal = new Notebook();
     
     journal.storeNotes("Amit is bad");
     journal.storeNotes("Raj is worse");
     
     journal.listNotes();
     
     journal.showNote(0);
     
     journal.removeNote(1);
     
     journal.listNotes();
     
    }
}
