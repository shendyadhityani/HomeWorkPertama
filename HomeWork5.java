public class HomeWork5
{
	public static void main (String[] args)
	{
		int x = 99;
		int y = 77;
		int z = 88;
		int resultPencarian = cariNilaiTerbesar(x,y,z);

		System.out.println("Nilai Maksimal dari f(99,77,88) adalah" + resultPencarian);
	}

	public static int cariNilaiTerbesar(int x, int y, int z)
	{
		int resultNilaiTerbesar;
		if (x > y) && (x > z)
			resultNilaiTerbesar = x;
		else if (y > z) && (y > x) 
			resultNilaiTerbesar = y;
		else 
			resultNilaiTerbesar = z;
		return resultNilaiTerbesar;
	}
}