class P81
{
	public static void main(String args[])	
	{
		int n=5;
	/*
	  A
   	 BC
  	DEF
       GHIJ
      KLMNO	
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--)
			{
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count+=i;

		}
    */
/*
    O
   NM
  LKJ
 IHGF
EDCBA


		int count=(n*(n+1))/2;
		for(int i=1; i<=n;i++)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count-=i;
		}
*/
/*
    A
   CB
  FED
 JIHG
ONMLK		
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count+=i+1;
		}	
		
*/
/*
    O
   MN
  JKL
 FGHI
ABCDE


		int count=(n*(n+1))/2;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count-=i+1;
		}

*/
/*
    A
   BF
  CGJ
 DHKM
EILNO

		int count=1;
		for(int i=1; i<=n; i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c+=n-j;
			}
			System.out.println();
			count++;
		}
*/
/*

    E
   DI
  CHL
 BGKN
AFJMO



		int count=n;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count--;
		}
		
*/
/*
    K
   LG
  MHD
 NIEB
OJFCA

		int count=((n*(n-1))/2)+1;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count++;
		}
*/
/*
    O
   NJ
  MIF
 LHEC
KGDBA


		int count=( n*(n+1)/2);
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(c+64));
				c-=j-1;
			}
			System.out.println();
			count--;
		}
		
*/

/*
    K
   GL
  DHM
 BEIN
ACFJO

		
		int count=((n*(n-1))/2)+1;
		for(int i=n; i>=1; i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++)
			{
				System.out.print((char)(c+64));
				c+=j+1;
			}
			System.out.println();
			count-=i-1;
		}
*/
/*
    O
   JN
  FIM
 CEHL
ABDGK

		int count=(n*(n+1))/2;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count-=i;
		}
			
			
*/

/*
    E
   ID
  LHC
 NKGB
OMJFA



	  	int count=n;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c-=j+1;
			}
			System.out.println();
			count+=i-1;
		}
	
		
			
*/

/*
    A
   FB
  JGC
 MKHD
ONLIE

		int count=1;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count+=i;
		}
*/

/*
ABCDE
 FGHI
  JKL
   MN
    O

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
		
*/

	
/*
ONMLK
 JIHG
  FED
   CB
    A
		int count=(n*(n+1))/2;	 			 		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i; j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count-=i;
		}

*/

/*
EDCBA
 IHGF
  LKJ
   NM
    O

		int count=n;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c--;
			}
			System.out.println();
			count+=i-1;
		}
*/

/*
KLMNO
 GHIJ
  DEF
   BC
    A
	       int count=((n*(n-1))/2)+1;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count-=i-1;
		}
*/
/*
AFJMO
 BGKN
  CHL
   DI
    E

		int count=1;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c+=n-j+1;
			}
			System.out.println();
			count++;
		}
*/
		
/*
EILNO
 DHKM
  CGJ
   BF
    A
		int count=n;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c+=n-j;
			}
			System.out.println();
			count--;
		}
*/

/*
OJFCA
 NIEB
  MHD
   LG
    K

		int count=(n*(n+1))/2;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c-=n-j+1;
			}
			System.out.println();
			count--;
		}

*/


	
		int count=((n*(n-1))/2)+1;
		for(int i=1; i<=n;i++)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--)
			{
				System.out.print((char)(c+64));
				c-=j-1;
			}
			System.out.println();
			count++;
		}
	
	

/*
		int count=1;
		for(int i=1; i<=n;i++)
		{
			int c=count;
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int j=n; j<=i; j++)
			{
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			count+=i;
		}
*/

	}
}