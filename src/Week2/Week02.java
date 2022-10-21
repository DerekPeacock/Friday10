package Week2;
import helpers.*;

public class Week02 
{
    public static final int SEVEN = 7;

    //public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        //System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        do7TimesTable();
        doConvertGrade();
    }    
    
    public static void doConvertGrade()
    {
        String value = InputReader.getString("Please enter your grade > ");
        
        char letter;

        letter = value.charAt(0);
        
        if(value.equals("A"))
        {
            System.out.println("Your grade is First Class");
        }
        else if(value.equals("B"))
        {
            System.out.println("Your grade is Upper Second Class");
        }
    }

    public static void do7TimesTable()
    {
        int value; int product;

        for(value = 1; value <= 12; value++)
        {
            product = value * SEVEN;
            System.out.println(" " + value + " x " + SEVEN + " = " + product );
        }
    }
}
