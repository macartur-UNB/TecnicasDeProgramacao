	import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;
	
	public class Cliente {
		public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket cliente = new Socket("11.10.6.222", 8888);
		
		System.out.println("O cliente se conectou ao servidor!");
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while (teclado.hasNextLine()) {
				saida.println(teclado.nextLine());
		}
			saida.close();
			teclado.close();
			cliente.close();
	}
}
