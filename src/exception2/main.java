package exception2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			try {
			System.out.println("Enter account data: ");
			System.out.println("Number: ");
			int num=sc.nextInt();
			sc.nextLine();
			System.out.println("Holder: ");
			String dono=sc.nextLine();
			System.out.println("Initial balance: ");
			float saldo=sc.nextFloat();
			System.out.println("Withdraw limit: ");
			float limite=sc.nextFloat();
			System.out.println();
			System.out.println("Enter the amount for withdraw: ");
			float saque=sc.nextFloat();
			Conta conta=new Conta(saldo, saque, limite);
			System.out.println("New balance: "+ conta);
		}catch(TesteException e) {
			System.out.println(e.getMessage());
		}	
		
		
	}

}
