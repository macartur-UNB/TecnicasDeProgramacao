package exercicio_17_7;
public class Programa implements Runnable {
	private int id;
// colocar getter e setter pro atributo id
	public void run () {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
