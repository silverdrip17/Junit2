package junit;

import java.util.Random;

public class GeneradorIp {
    private Random random;

    public GeneradorIp() {
        random = new Random();
    }

    public int generarNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public String generarIp() {
        int num1 = generarNumero(1, 254);
        int num2 = generarNumero(0, 254);
        int num3 = generarNumero(0, 254);
        int num4 = generarNumero(1, 254);

        return num1 + "." + num2 + "." + num3 + "." + num4;
    }
}
