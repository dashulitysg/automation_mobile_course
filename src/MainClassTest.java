import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber()
    {
        MainClass mainClass = new MainClass();
        int a = mainClass.getLocalNumber();
        if(a == 14) {
            System.out.println("Correct number");

        } else {
            System.out.println("Incorrect number");
        }
    }
}
