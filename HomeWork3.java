import static java.lang.Math.*;
public class HomeWork3
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 2;
		int z = 3;
		int resultHasil = rumusAgungPrasetyo(x,y,z);

		System.out.print("Hasil f(1,2,3) dari rumus  f(x,y,z) = 5x^3 + 7y^2 + 9z + 13 adalah" + resultHasil);

	}

	public static int rumusAgungPrasetyo (int x, int y, int z)
	{
		int nilA = 3;
		int a = (int) pow(x,nilA);
		int nilB = 2;
		int b = (int) pow(y,nilB);
		int c = 9*z;
		int d = 13;
		int perhitunganRumus = (5*a)+(7*b)+c+d;
		return perhitunganRumus;
	}
}