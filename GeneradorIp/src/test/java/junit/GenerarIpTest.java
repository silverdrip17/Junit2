package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class GenerarIpTest {
GeneradorIp generador;
	@BeforeEach
	void setUp() throws Exception {
		generador = new GeneradorIp();
	}

	@RepeatedTest(999)
	void testGenerarNumero() {
		int numero = generador.generarNumero(0, 254);
		assertTrue(numero >= 0 && numero <= 254, "El número generado debe estar entre 0 y 254");
		
	}
	@Test
	void testGeneradorIp() {
		String ip = generador.generarIp();
        String[] segmentos = ip.split("\\.");

        assertTrue(!segmentos[0].equals("0"), "El primer segmento de la IP no debe ser 0");
        assertTrue(!segmentos[3].equals("0"), "El último segmento de la IP no debe ser 0");
	}

}
