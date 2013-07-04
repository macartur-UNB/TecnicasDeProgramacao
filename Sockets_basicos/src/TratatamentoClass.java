import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TratatamentoClass implements Runnable   {

	private ServerSocket servidor;
	
	public TratatamentoClass(ServerSocket servidor2){
		this.servidor = servidor2;
	}	
	
	@Override
	public void run() {
		Scanner s;
		try {
			s = new Scanner(servidor.getInputStream());
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			s.close();
		} catch (IOException e) {
			System.out.println("erro de entrada de dados");
		}	
	}	
}
