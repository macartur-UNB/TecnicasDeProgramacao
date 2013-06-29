package teste;

import java.io.IOException;
import java.io.Reader;

public class ReaderQueLancaExcessao extends Reader{

	@Override
	public void close() throws IOException {		
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		throw new IOException();
	}
	

}
