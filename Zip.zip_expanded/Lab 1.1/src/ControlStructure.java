
public class ControlStructure 
{
	public static void main(String [] args)
	{
		fooBarBaz();
		System.out.println("");
		System.out.println("Next Part");
		System.out.println("");
		primePrinter();
		System.out.println("We're Done");
	}
	public static void fooBarBaz()
	{
			int x = 1;
			int counter=1;
				while (x <= 50)
		{
					{
						if (x % 7 == 0)
							System.out.print ("Bar");
						if (x % 3 == 0)
							System.out.print ("foo");
						if (x % 10 == 0)
							System.out.print ("Baz");
						if (!(x % 10 == 0) && !(x % 3 == 0) && !(x % 7 == 0))
							System.out.print (x);
					}
					x++;
					System.out.print(",");
				counter ++;
				 if (counter % 10 == 1) 
					 System.out.println("");
		}
	}
	public static void primePrinter()
	{
			int x=200;
			int y=10000; 
			int counter = 1;
			int i =2; 
				while ( counter <= (x))
				{
						int z = 2;
						for ( int g= 2 ; g<= y; g++)
						{
							if ( i == g){}
							else if ( i%g==0) {z++;}
						}
							if (z == 2) 
							System.out.println(i);
								i++;
									counter ++;
				}
	}
}
