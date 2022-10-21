package Week3;

public class Student 
{
    private String id;
    private String fullName;

    public Student(String id, String fullName) 
    {
        this.id = id;
        this.fullName = fullName;
    }

    public void enrol(Course course)
    {
        //this.course = course;
    }

    public void print()
    {
        System.out.println(id + " " + fullName);
    }    
}
