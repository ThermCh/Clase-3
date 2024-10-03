package clase3;

import javax.swing.JOptionPane;

public class Clase3 {

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 10; i++) {
            //System.out.print("i = "+i+"\n" );
            
        }
        
        for (int i = 10; i > 0; i--) {
            int a=1000;
            if(i==0){System.out.println("Feliz año nuevo");
            }else{
            System.out.print("i = "+i+"\n" );
            }
            a=a+20;
            System.out.print(a);
        }
        
            
        int i=1;
        //Ejemplo llegar 10 desde el 1
        while (i < 11) {     
            System.out.print("i = "+i+"\n" );
            i++;
        }
         


        //Ejercicio 1
        int i = 0;
        int j = 0;
        String palabra = "";
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                palabra += "@";

            }
            palabra += "\n";

        }
        JOptionPane.showMessageDialog(null, palabra);
         

        //Ejercicio 2
        int num = 0;
        String tabla = "";
        num = Integer.parseInt(JOptionPane.showInputDialog("Cual es la tabla de multiplicar que busca? "));
        for (int k = 0; k < 11; k++) {
            int multiplicacion = k * num;
            tabla += "El num " + num + "*" + k + "=" + multiplicacion + "\n";

        }
        JOptionPane.showMessageDialog(null, tabla);
         */
        //Ejercicio 3
        int contador = 0;
        String triangulo = "*";
        //Solicitar y convertir datos
        contador = Integer.parseInt(JOptionPane.showInputDialog("Cuantas filas va a tener el triangulo"));

        //Cantidad de filas
        for (int i = 0; i < contador - 1; i++) {

            //Repetir * en la misma linea
            while (i < contador) {
                triangulo = "*" + "\n";
                JOptionPane.showMessageDialog(null, triangulo);

            }

        }

    }

}
