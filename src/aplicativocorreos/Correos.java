package aplicativocorreos;

/**
 *
 * @author jaimeponcemeza
 */
public class Correos {

    private String letra;
    private int numero;
//        public Correos() {
//      };
    public Correos(String letra, int num) {
        this.letra = letra;
        this.numero = num;
    }

    public int aumentarNumero(int num) {
        num= numero++ ;
        return num;
    }

    public String getLetra() {
        
        return letra;
    }

    public int getNumero() {
        return numero;
    }
}
