
interface PerfectSquare{
	boolean test(int n);
}

interface Quotient //interface for quotient
{
	void quo(float a, float b);

}

public class VRGitDemo
{
	public static void main(String[] args)
	{

		PerfectSquare s = (int num) -> Math.sqrt(num) == Math.floor(Math.sqrt(num));
		System.out.println(s.test(144));
		//learned lambda notation, Math.floor method, and comparing values in an interface

		//QUOTIENT
		Quotient q = (float a, float b) -> System.out.printf("%.3f", a/b);
		q.quo(5f, 2f);

	}
}