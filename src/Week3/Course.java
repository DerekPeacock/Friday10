package Week3;

public class Course 
{
    private String code;
    
    private String title;

    public Course(String code, String title) 
    {
       this.code = code;
       this.title = title;
    }

    public void print()
    {
        System.out.println(title + " (" + code + ")");
    }
}
