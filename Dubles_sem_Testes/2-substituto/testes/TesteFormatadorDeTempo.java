package testes;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import sistema.FormatadorDeTempo;
import sistema.Relogio;

public class TesteFormatadorDeTempo {

	@Test
	public void deveDizerMeiaNoiteQuandoForMeiaNoite() throws Exception{
		FormatadorDeTempo formatador = new FormatadorDeTempo();
		formatador.setRelogio(new Relogio() {
			@Override
			public Calendar agora() {
				Calendar meiaNoite = Calendar.getInstance();
				meiaNoite.set(Calendar.HOUR_OF_DAY, 0);
				return meiaNoite;
			}
		});
		String hora = formatador.horaAtualPorEscrito();
		assertEquals("Meia-noite", hora);
	}

	@Test
	public void deveDizerMeiaDiaQuandoForMeioDia() throws Exception{
		FormatadorDeTempo formatador = new FormatadorDeTempo();
		formatador.setRelogio(new Relogio() {
			@Override
			public Calendar agora() {
				Calendar meioDia = Calendar.getInstance();
				meioDia.set(Calendar.HOUR_OF_DAY, 12);
				return meioDia;
			}
		});
		String hora = formatador.horaAtualPorEscrito();
		assertEquals("Meio-dia", hora);
	}
}
