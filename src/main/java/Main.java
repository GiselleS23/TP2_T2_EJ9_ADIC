/* 9.- Construya un algoritmo tal que, dados los valores enteros P y Q, determine si los mismos satisfacen la siguiente expresión: P3+Q+-2p2<680 En caso afirmativo debe imprimir los valores PyQ. 
Sacchetti, Maria Giselle C2 */
/* EJEMPLO DE VALORES QUE SATISFACEN: P=6 Y Q=2 
p=0 q=0; */

import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /* int p, q; */
    int resultado;

    System.out.println("Ingresar el valor de P:");
    int p = scanner.nextInt();

    System.out.println("Ingresar el valor de Q:");
    int q = scanner.nextInt();
    //uso math.pow para elevar a las potencias 3 y 2
    resultado = (int) Math.pow(p, 3) + (int) Math.pow(q, 2);
    if (resultado < 680) {
      System.out.println("Los valores de P y Q si satisfacen la expresion");
    } else {
      System.out.println("Los valores de P y Q no satisfacen la expresion");
    }
    scanner.close();

  }

}
/*
  int p = 2;
  int q = 3;
  int resultado = 0;

 resultado = (int) (Math.pow(p, 3)) + q - 2 * (int) (Math.pow(p, 2));

 if(resultado < 680){
 System.out.println("P: " + p + " Q: " + q); }
 */