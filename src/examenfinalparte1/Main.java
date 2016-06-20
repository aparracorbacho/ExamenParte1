package examenfinalparte1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        * Creamos un objeto de la clase principal con dos parametros
        * Renombramos el objeto para identificarlo
        */
        Metodos objeto2var = new Metodos(10, 20);
        
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
        Metodos objeto1var = new Metodos(10);
        
        /*
        * Sacamos la variable valorfinal del objeto anteriormente creado para poder mostrarlo
        * Renombramos la variable a vmetodo1var que corresponde a Variable del Metodo que introduce 1 Variable
        */
        int vmetodo1var = objeto1var.valorfinal;
        System.out.println("El resultado del metodo que introduce una variable es: " + vmetodo1var);
        
        /*
        * Creamos un objeto de la clase principal sin parametro
        * Renombramos el objeto para identificarlo
        */
        Metodos objetosinvar = new Metodos();
        
        /*
        * Sacamos la variable valorfinal del objeto anteriormente creado para poder mostrarlo
        * Renombramos la variable a vmetodosinvar que corresponde a Variable del Metodo no introduce variable
        */
        int vmetodosinvar = objetosinvar.valorfinal;
        System.out.println("El resultado del metodo que no introduce ninguna variable es: " + vmetodosinvar);
    }
}
