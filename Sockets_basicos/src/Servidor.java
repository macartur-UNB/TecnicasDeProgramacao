

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String args[]) throws IOException{
		ServerSocket servidor = new ServerSocket(8888);
		Socket cliente;
		
		System.out.println("porta 8888 aberta");
		
		while(true){
		
			cliente = servidor.accept();
			
			System.out.println("Nova conexão com o cliente " +
			cliente.getInetAddress().getHostAddress()
			); // imprime o ip do cliente
			
			TratatamentoClass tramaento = new TratatamentoClass(servidor);
			
			cliente.close();
		}
		
		System.out.println("fechado");
	}
	
}
