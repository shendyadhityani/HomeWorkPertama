import static java.lang.Math.*;
public class HomeWork2
{
	public static void main(String [] args)
	{
		int a = 3;
        int[] bilPangkat3 = new int[10];
                for (int i=1; i < bilPangkat3.length; i++)
                {
					bilPangkat3[i] = (int) pow(i,a);
					System.out.println(bilPangkat3[i]);
                }
    }
}