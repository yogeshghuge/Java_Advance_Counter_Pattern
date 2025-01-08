/*
ABCDE
 FGHI
  JKL
   MN
    O
*/
class P93
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count+=i;
		}
	}
}
