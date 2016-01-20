import java.awt.Color;
import java.util.Scanner;

/**
 * Created by Mat on 20/01/2016.
 */
public class EjecutableVectorFiguraGeometrica {
    public static void main(String[] args) {
        System.out.println("EjerciciosM03 ::Marc Cano::");
        Scanner teclat = new Scanner(System.in);

        GrupOrdenatFiguraGeometricaViaVector controladorDeVector= new GrupOrdenatFiguraGeometricaViaVector(50);

        //creacion de objectos

        Triangle02 triangle1 = new Triangle02(78,"triangle1", Color.blue, 8.6, 2.2);
        Cercle02 cercle1 = new Cercle02(97,"cercle1", Color.green, 3.2);
        Rectangle02 rectangle1 = new Rectangle02(99,"rectangle1", Color.DARK_GRAY, 4.3, 3.2);
        Cercle02 cercle2 = new Cercle02(75,"cercle2", Color.red, 5.2);
        Rectangle02 rectangle2 = new Rectangle02(52,"rectangle2", Color.ORANGE, 5.1, 4.2);
        Triangle02 triangle2 = new Triangle02(21,"triangle2", Color.red, 8.6, 2.2);
        Triangle02 triangle3 = new Triangle02(52,"triangle3", Color.magenta, 3.6, 4.2);
        Cercle02 cercle3 = new Cercle02(3,"cercle3", Color.gray, 3.2);
        Triangle02 triangle4 = new Triangle02(21,"triangle4", Color.cyan, 8.6, 2.2);
        Rectangle02 rectangle3 = new Rectangle02(90,"rectangle3", Color.pink, 5.1, 4.2);
        //-------------------

        String menu = "";
        boolean on = true;//condicio de sortida del programa

        while (on){
            System.out.println("\n");
            System.out.println("MENU:");
            System.out.println("1--> Añadir objetos al vector");
            System.out.println("2--> Eliminar objeto del vector");
            System.out.println("3--> Ver estado del vector");
            System.out.println("4-->  Ordenar la informació dels alumnes per NIF/NIE:");
            System.out.println("5-->  Visualitzar informació de tots els alumnes:");
            System.out.println("6-->  Visualitzar informació dels repetidors:(*)");
            System.out.println("7-->  Visualitzar número de repetidors i no repetidors:(*)");
            System.out.println("8-->  Visualitzar la nota mitja de la classe(*)");
            System.out.println("9-->  Reiniciar tota la informació");
            System.out.println("0-->  Sortir del programa");
            System.out.println(" ");
            menu = teclat.nextLine();

            switch (menu){
                case "1":{
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(triangle1), triangle1);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(cercle1), cercle1);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(rectangle1), rectangle1);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(cercle2), cercle2);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(rectangle2), rectangle2);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(triangle2), triangle2);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(triangle3), triangle3);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(cercle3), cercle3);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(triangle4), triangle4);
                    controlDeErroresAlanyadir(controladorDeVector.anyadir(rectangle3), rectangle3);

                    break;
                }//case_1

                case "2":{
                    System.out.println("\nEntra id:");
                    int id = teclat.nextInt();
                    System.out.println("...eliminando");
                    controladorDeVector.eliminar(id);

                    break;
                }


            }//switch



        }

    }//main


    private static void controlDeErroresAlanyadir (int error, FiguraGeometrica02 obj) {
        System.out.println ("...añade objeto: " + obj.toString());
        if (error == -1) System.out.println("...añadido");
        else if (error == -2) System.out.println("...no se añade :: el objeto tiene valor nulo");
        else if (error == -3) System.out.println("...No añadido :: vector de figuras lleno");
        else System.out.println("...Codigo: " + obj.getCodi() + " existent a la posici� "+error);
    }

}
