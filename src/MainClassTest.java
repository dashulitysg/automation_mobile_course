import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Test
    public void testGetClassNumber()
    {
        MainClass mainClass = new MainClass();
        int a = mainClass.getClassNumber();

        if (a > 45)
        {
            System.out.println("Correct number");
        }
        else
        {
            System.out.println("Incorrect number");
        }
    }
}
