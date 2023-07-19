public class Dowhile_assignment 
{

	public static void main(String[] args) 
	{
		int i = 1;
		int j = 10;
		do {
			if(i++ > j--) 
			 {
				continue;
			 }
		   }
		while (i<5); 
			System.out.println(i+ " " +j);
	}

}
