package examenfinalparte1;

public class Principal {

    int valorfinal;
    
    /*
    * Este metodo mete en la variable valorfinal la suma de los dos numeros que se le pasan
    * @param numero1 El primer parametro que se introduce
    * @param numero2 El segundo parametro que se introduce al metodo
    */
    public Principal(int numero1, int numero2) {
        valorfinal = suma(numero1, numero2);
    }
    
    /*
    * Este metodo suma el numero que se le pasa consigo mismo y lo mete en valorfinal
    * @param numero El numero que se introduce al metodo
    */
    
    public Principal(int numero) {
        valorfinal = suma(numero, numero);
    }
    
    /*
    * Este metodo coloca la variable valorfinal en -1
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
