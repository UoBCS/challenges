package challenge3;

/**
 * Test for challenge3 classes
 * @author ossama
 */
public class Test
{
    public static void main(String[] args)
    {
        Random rn = new Random();
        
        for (int i = 0; i < 20; i++)
            System.out.println(rn.Next()); 
    }
}