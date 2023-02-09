package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to count up to?");
		int n = in.nextInt();
		
		
		
		boolean[] allIntegers = new boolean[n+1];
		for (int i = 0; i < allIntegers.length; i++)
		{
			allIntegers[i] = true;
			
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			int k = 0;
			int j = 0;
			
			if (allIntegers [i]==true) {
			
			while(((int)Math.pow(i, 2)+k*i)<=n) {
				
				j = (int)Math.pow(i, 2)+k*i;
				allIntegers[j]=false;
				k++;
			}
			}
			
		}
		
		for(int i = 2; i<allIntegers.length;i++) {
			if(allIntegers[i]==true) {
				System.out.println(i);
			}
		}
	}

}
