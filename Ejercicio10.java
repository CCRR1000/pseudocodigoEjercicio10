/*
   10. Se leen desde teclado números hasta que la suma de los mismos llegue a 1000. Mientras tanto debe hallar:
        a. La cantidad de números múltiplos de 6.
		b. La suma de los números que se encuentran entre el 1 y el 10 (incluidos).
*/

import java.util.*;

public class Ejercicio10 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int sumaMenor10 = 0, multiplo6 = 0, sumaNum=0;

		System.out.println();
		do {
			System.out.print("Ingrese un numero: ");
			int num = read.nextInt();

			sumaNum += num;

			if (num%6==0) {
				multiplo6++;
			}

			if (num<=10 && num>0) {
				sumaMenor10 += num;
			}

		} while (sumaNum<1000);

		System.out.println("\n  Multiplos de 6: "+multiplo6);
		System.out.println(  "  Suma de numeros entre 1 y 10: "+sumaMenor10+"\n");
	}


}

