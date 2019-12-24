import org.junit.Test;

public class MainClassTest
{

    @Test
    public void testGetClassString()
    {
        MainClass mainClass = new MainClass();
        boolean isContain = mainClass.getClassString().contains("Hello") || mainClass.getClassString().contains("hello");
        if (isContain == true) {
            System.out.println("Validation passed");
        }
        else
        {
            System.out.println("Validation failed");
        }
    }
}
