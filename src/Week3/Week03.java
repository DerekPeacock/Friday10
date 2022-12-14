package Week3;
import helpers.*;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    private static Student derek;
    private static Course myCourse;

    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        createStudent();
        createCourse();
        enrolStudent();
    }     

    public static void enrolStudent()
    {
        derek.enrol(myCourse);
        derek.print();
    }
    
    public static void createCourse()
    {
        String code = null;
        String title = null;

        code = InputReader.getString("Please enter your course code > ");
        title = InputReader.getString("Please enter your course title > ");

        Course myCourse = new Course(code, title);
    }

    private static void createStudent() 
    {
        String name = "anon";

        System.out.println();
        String id = InputReader.getString("Please enter your id > ");
        
        boolean isValid = false;
        while(!isValid)
        {
            name = InputReader.getString("Please enter your name > ");
            String answer = InputReader.getString(name + " is this name correct > ");

            if(answer.contains("yes"))
            {
                isValid = true;
            }
        }
        
        Student derek = new Student(id, name);
        derek.print();
    }         
}
