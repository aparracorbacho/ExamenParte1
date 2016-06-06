package examenfinalparte1;

public class Principal {

    int i;
    
    /*
    * Este metodo mete en la variable i la suma de los dos numeros que se le pasan
    */
    public Principal(int j, int m) {
        i = suma(j, m);
    }
    
    /*
    * Este metodo suma el numero que se le pasa consigo mismo y lo mete en i
    */
    
    public Principal(int j) {
        i = suma(j, j);
    }
    
    /*
    * Este metodo coloca la variable i en -1
    */
    
    public Principal() {
        i = -1;
    }

    /*
    * Renombramos el metodo que suma variables
    * @return devuelve la suma de las dos variables
    */
    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
