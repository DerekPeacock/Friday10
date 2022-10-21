package CW1;
import Week3.Student;
import java.util.ArrayList;
import helpers.*;

/**
 * This class will allow the user to 
 * 
 *    1. Add NewSong
 *    2. Delete an old song
 *    3. Print all songs
 *    4. Print top songs
 * 
 * @author: Derek Peacock
 */
public class Songlist 
{
    private ArrayList<Student> students;

    public Songlist() 
    {
        students = new ArrayList<Student>();
        doMainMenu();
    }

    private void doMainMenu() 
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();
                case 4: wantToQuit = true; break;
            }
        }
    }

    private void displayMenu() 
    {
    }

    /**
     * This method will ask the user for the
     * title of the song, the artist name
     * and how many times it has been streamed
     */
    private void addSong()
    {

    }

    private void deleteSong()
    {

    }

    private Student findSong()
    {
        return null;
    }

    private void printSongs()
    {

    }
}
