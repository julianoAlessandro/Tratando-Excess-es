package TratarExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZero {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	boolean continua = true;
	do {
		
		try {
			System.out.print("Digite o numerador:");
			int a = leia.nextInt();
			System.out.print("Digite o Denominador:");
			int b = leia.nextInt();
			System.out.println(a/b);
			continua = false;
		}
		catch(InputMismatchException e1) {
			System.out.println("Os numeros devem ser inteiros");
			leia.nextLine();
			
		}
		catch(ArithmeticException e2) {
			System.err.println("O divisor deve ser diferente de zero");
		}
		finally{
			System.err.println("Finaly executado...");
			
			// executa independente  se tiver ocorrido o erro 
		}
		
		
	}while(continua);

	
	

	}

}
