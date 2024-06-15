package ExamenFinalVarianteC;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al menu de examen final\n" +
                "Seleccione una opcion\n" +
                "1. Cual es mayor\n" +
                "2. Crear un frase\n" +
                "3. Calculadora\n" +
                "4. Es un numero primo?");
        int op = 0;
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        switch (op) {
            case 1: {
                ExamenFinalVarianteC.cualEsMayor
            }
            break;
            case 2: {
                ExamenFinalVarianteC.texto
            }break;
            case 3:{
                ExamenFinalVarianteC.calculadora
            }break;
            case 4:{
                ExamenFinalVarianteC.primo
            }break;
            case 5:{
                String nombre = " ";
                int calificaion = 0;
                Scanner sc= new Scanner(System.in);
                System.out.println("Ingrese un nombre");
                nombre=sc.next();
                System.out.println("Ingrese una calificacion");
                calificaion=sc.nextInt();
                new Estudiante(nombre, calificaion);
            }
        }
    }

    public static class ExamenFinalVarianteC {
        public static Object cualEsMayor;

        static {
            int num1, num2, num3;
            System.out.println("Ingrese 3 numeros: ");
            Scanner sc = new Scanner(System.in);
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("El numero mayor es " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El numero mayor es " + num2);
            } else {
                System.out.println("El numero mayor es" + num3);
            }

        }
        public static Object texto;
        static {
            String frase1,frase2,frase3,resultado=" ";
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingrese 3 frases o palabras: ");
            frase1= sc.next();
            frase2= sc.next();
            frase3= sc.next();
            resultado=frase1+frase2+frase3;
            System.out.println("La oracion que se formo es "+resultado);
        }
        public static Object calculadora;
        static {
            int num1,num2,resultado;
            String op=" ";
            System.out.println("Ingrese 2 numeros: ");
            Scanner sc=new Scanner(System.in);
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println("Que desea hacer(Introduzca el simbolo)\n" +
                    "+ Sumar\n" +
                    "- Restar\n" +
                    "* Multiplicar\n" +
                    "/ Dividir");
            op= sc.next();
            if ("+" == op){
                resultado=num1+num2;
                System.out.println("La suma de los numeros es "+resultado);
                } else if ("-"==op) {
                resultado=num1-num2;
                System.out.println("La resta de los numeros es "+resultado);
            } else if ("*"==op) {
                resultado=num1*num2;
                System.out.println("La multiplicacion de los numeros es "+resultado);
            } else if ("/"==op) {
                resultado=num1/num2;
                System.out.println("La division de los numeros es "+resultado);
            }else {
                System.out.println("Simbolo no reconocido intentelo de nuevo");
        }
        }
        public static Object primo;
        static {
            int num,primo,primo2;
            System.out.println("Ingrese un numero para saber si es primo:");
            Scanner sc = new Scanner(System.in);
            num=sc.nextInt();
                primo=num%2;
                primo2=num%3;
                if (primo!=0 || primo2!=0){
                    System.out.println("El numero es primo");
            }else {
                    System.out.println("El numero no es primo");
                }
        }
    }
    public static class Estudiante{
    private String nombre;
    private int calificacion;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
        }

        public Estudiante(String pnombre, int pcalificacion){
        nombre=pnombre;
        calificacion=pcalificacion;
    }
    }
}
