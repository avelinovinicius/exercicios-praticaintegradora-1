import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int par = 0;
		
		System.out.println("Digite um numero");
		int n = sc.nextInt();

		for (int i =0; par<=n; i++)
		{
			if (i%2 == 0)
			{
				System.out.println(i);
				par++;
			}
		}
		
		sc.close();
		
	}

}
