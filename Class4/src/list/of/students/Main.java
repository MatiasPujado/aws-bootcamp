package list.of.students;


import java.util.Locale;
import java.util.Scanner;

/**
 * Streams & Lambdas:
 * <p>
 * Defina la clase Alumno con los siguientes campos:
 * int id
 * string dni
 * string nombre
 * string apellido
 * string curso
 * double nota
 * int edad
 * <p>
 * Cree un Lista y carge un numero considerable de alumnos para que el ejercicio sea viable (15 o mas) con valores al azar.
 * <p>
 * a) Muestre todos los alumnos de la lista
 * b) Muestre todos los alumnos ordenados de menor a mayor por edad
 * c) Muestre aquellos alumnos cuyo nombre empieza con un caracter dado (elegir el caracter en base a la lista de nombre que se utilizo)
 * d) Sume la edad de todos los alumnos
 * e) Obtenga un mapa donde la clave sea la nota y el valor sea una lista de alumnos que tienen esa nota
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClassRoom cr = new ClassRoom();

        cr.fillStudentsList();

        System.out.println("");
        System.out.println("################################");
        System.out.println("     List of Students");
        System.out.println("################################");
        System.out.println("");
        cr.printStudentsList();
        System.out.println("");

        //////////////////////////////////////////////////////////////////////////////////

        cr.sortByAgeAsc();
        System.out.println("");
        System.out.println("################################");
        System.out.println("     Sorting by Age");
        System.out.println("################################");
        System.out.println("");
        cr.printStudentsList();
        System.out.println("");

        //////////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("################################");
        System.out.println("     Filter by Character");
        System.out.println("################################");
        System.out.println("");
        System.out.println("Filter names by first character");
        String letter = sc.nextLine().toUpperCase();
        System.out.println("");
        cr.filterByChar(letter);
        System.out.println("");

        //////////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("################################");
        System.out.println("     Total sum of all ages");
        System.out.println("################################");
        System.out.println("");
        System.out.println(cr.sumOfAllAges());
        System.out.println("");

        //////////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("################################");
        System.out.println("     Filter by score using Map");
        System.out.println("################################");
        System.out.println("");
        System.out.println("Filter students by score: [1-10]");
        int score = sc.nextInt();
        System.out.println("");
        cr.filterByScore(score);

    }
}
