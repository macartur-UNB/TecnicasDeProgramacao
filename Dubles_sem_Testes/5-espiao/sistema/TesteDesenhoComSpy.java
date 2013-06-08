package sistema;

import static org.junit.Assert.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.Test;

public class TesteDesenhoComSpy {

	protected Observable observaleRecebido;
	protected Object argumentoRecebido;
	protected int contadorNotificacoes;
	
	@Test
	public void deveNotificarObservadoresQuandoAdicionarFiguras()
			throws Exception{
		Desenho desenho = new Desenho();
		Figura  figura = new Figura("quadrado");
		
		contadorNotificacoes=0;
		
		Observer observerEspiao = new Observer(){
			@Override
			public void update(Observable umObservavel, Object umObjeto){
				observaleRecebido = umObservavel;
				argumentoRecebido = umObjeto;
				contadorNotificacoes++;
				
			}
		};
		desenho.addObserver(observerEspiao);
		desenho.adicionaFigura(figura);
		
		assertEquals(1,	contadorNotificacoes);
		assertEquals(desenho, observaleRecebido);
		assertEquals(figura, argumentoRecebido);
		
	}

}
