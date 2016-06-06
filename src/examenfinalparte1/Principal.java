package examenfinalparte1;

public class Principal {

    int valorfinal;
    
    /*
    * Este metodo mete en la variable i la suma de los dos numeros que se le pasan
    */
    public Principal(int numero1, int numero2) {
        valorfinal = suma(numero1, numero2);
    }
    
    /*
    * Este metodo suma el numero que se le pasa consigo mismo y lo mete en i
    */
    
    public Principal(int numero) {
        valorfinal = suma(numero, numero);
    }
    
    /*
    * Este metodo coloca la variable i en -1
    */
    
    public Principal() {
        valorfinal = -1;
    }

    /*
    * Renombramos el metodo que suma variables
    * @return devuelve la suma de las dos variables
    */
    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
