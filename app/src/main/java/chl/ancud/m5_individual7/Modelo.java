package chl.ancud.m5_individual7;

public class Modelo {

    public static final int DEBIL = 0;
    public static final int MEDIA = 1;
    public static final int FUERTE = 2;

    public int validarClave(String clave) {
        if (clave.length() < 5) {
            return DEBIL;
        } else if (clave.equals(clave.toLowerCase())) {
            return MEDIA;
        } else {
            return FUERTE;
        }
    }
}
