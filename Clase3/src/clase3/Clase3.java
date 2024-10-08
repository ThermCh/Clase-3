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
        
        //Ejercicio 3
        int contador = 3;
        String triangulo = "";
        //Solicitar y convertir datos
        contador = Integer.parseInt(JOptionPane.showInputDialog("Cuantas filas va a tener el triangulo"));

        //Cantidad de columnas
        for (int i = 0; i < contador; i++) {

            //Repetir * en la misma fila
            for (int j = 0; j < i + 1; j++) {
                triangulo += "*";
            }
            triangulo += "\n";
        }
        JOptionPane.showMessageDialog(null, triangulo);

       
        
        //Ejercicio 4
        String numbers="";
        int numSquare=0;
        for (int i = 20; i < 31; i++) {
            numSquare=i*i;
            numbers+="El numero es: "+i+" Al cudrado es: "+ numSquare+"\n";
            
        }
        JOptionPane.showMessageDialog(null, numbers);
         
        //Ejercicio 5
        int students = 0;
        int noteHi = 0;
        int noteLow = 100;
        int average = 0;
        int studentApp = 0;
        //Variable usar para comparar
        int note = 0;

        //Variable para sacar el promedio
        int noteAverage = 0;

        //Solicitar cantidad estudiantes
        students = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes son? "));

        //Solicitar informacion de cada estudiantes
        for (int i = 0; i < students; i++) {
            note = Integer.parseInt(JOptionPane.showInputDialog("Cual es la nota del estudiante? "));
            noteAverage += note;

        //Buscar Nota Mayor
            if (note > noteHi) {
                noteHi = note;
            }
        //Buscar nota menor
            if (note < noteLow) {
                noteLow = note;
            }

        //Cantidad estudiantes aprovados
            if (note >= 69) {
                studentApp++;

            }

        //Promedio 
            average=noteAverage/students;
        }
        JOptionPane.showMessageDialog(null, "Los estudiantes aprovados son: "+studentApp+" \n La nota mas alta es: "+noteHi+" \n La nota mas baja es: "+noteLow+" \nY el promedio es: "+noteAverage);
        */
        //Ejercicio 6
        boolean students = true;
        int studentsAmoun=0;
        int noteHi = 0;
        int noteLow = 100;
        int average = 0;
        int studentApp = 0;
        //Variable usar para comparar
        int note = 0;

        //Variable para sacar el promedio
        int noteAverage = 0;

        

        //Solicitar informacion de cada estudiantes //Infinito
        while (students) {
            studentsAmoun=+1;
            note = Integer.parseInt(JOptionPane.showInputDialog("Cual es la nota del estudiante? "));
            noteAverage += note;

        //Buscar Nota Mayor
            if (note > noteHi) {
                noteHi = note;
            }
        //Buscar nota menor
            if (note < noteLow) {
                noteLow = note;
            }

        //Cantidad estudiantes aprovados
            if (note >= 69) {
                studentApp++;

            }
        //Terminar Ciclo
            if(note<=69){
                students=false;
            }

        //Promedio 
            average=noteAverage/studentsAmoun;
        }
        JOptionPane.showMessageDialog(null, "Los estudiantes aprovados son: "+studentApp+" \n La nota mas alta es: "+noteHi+" \n La nota mas baja es: "+noteLow+" \nY el promedio es: "+noteAverage);
    }

}
