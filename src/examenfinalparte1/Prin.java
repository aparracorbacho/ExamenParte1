package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        /*
        * Creamos un objeto de la clase principal con dos parametros
        * Renombramos el objeto para identificarlo
        */
        Principal objeto2var = new Principal(10, 20);
        /*
        * Sacamos la variable valorfinal del objeto anteriormente creado para poder mostrarlo
        * Renombramos la variable a vmetodo2var que corresponde a Variable del Metodo que introduce 2 Variables
        */
        int vmetodo2var = objeto2var.valorfinal;
        System.out.println("El resultado del metodo que introduce dos variables es: " + vmetodo2var);
        
        /*
        * Creamos un objeto de la clase principal con un parametro
        * Renombramos el objeto para identificarlo
        */
        Principal objeto1var = new Principal(10);
        
        /*
        * Sacamos la variable valorfinal del objeto anteriormente creado para poder mostrarlo
        * Renombramos la variable a vmetodo1var que corresponde a Variable del Metodo que introduce 1 Variable
        */
        int vmetodo1var = objeto1var.valorfinal;
        
        System.out.println("Es: " + vmetodo1var);
        Principal mn = new Principal();
        int nn = mn.valorfinal;
        System.out.println("Es: " + nn);
    }
}
