public class HomeWork4
{
	public static void main (String[] args)
	{
		int x = 9;
		int y = 99;
		int z = cariNilaiMaksimal(x,y);

		System.out.println("Nilai Maksimal dari f(9,99) adalah" + z);
	}

	public static int cariNilaiMaksimal(int x, int y)
	{
		int resultNilaiMaksimal;
		if (x > y)
			resultNilaiMaksimal = x;
		else 
			resultNilaiMaksimal = y;

		return resultNilaiMaksimal;
	}
}