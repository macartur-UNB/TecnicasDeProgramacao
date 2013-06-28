package exercicio_17_8;

import java.util.Collection;
import java.util.Vector;

public class ProduzSQL implements Runnable{
	private int comeco;
	private int fim;
	private Vector<String> sqls;
		public ProduzSQL(int comeco, int fim, Vector<String> sqls2) {
			this.comeco = comeco;
			this.fim = fim;
			this.sqls = sqls2;
		}
		public void run() {
			for (int i = comeco; i < fim; i++) {
//				synchronized(sqls){
					sqls.add("SQL"+i);
//				}
		}
	}
}

