package exercicio_17_8;

import java.util.Collection;

public class ProduzSQL implements Runnable{
	private int comeco;
	private int fim;
	private Collection<String> sqls;
		public ProduzSQL(int comeco, int fim, Collection<String> sqls) {
			this.comeco = comeco;
			this.fim = fim;
			this.sqls = sqls;
		}
		public void run() {
			for (int i = comeco; i < fim; i++) {
				synchronized(sqls){
					sqls.add("SQL"+i);
				}
		}
	}
}

