package CW1;

/**
 * This class will store the details of a single song
 * @author Derek Peacock
 */
public class Song 
{
    private int id;

    private String title;

    private String artist;

    private int playCount;

    public Song(String title, String name, int count) 
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
    }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }

}
