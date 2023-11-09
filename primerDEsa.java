package primerDEsa;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class primerDEsa {
	
	static int falla = 3;
	static boolean flag = false;
	static Random random = new Random();

	static int intentos = 0;
	static int numeroSecreto = random.nextInt(100);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);



		try {
			
			adivinar();
			
		} catch (ArithmeticException e) {
			System.out.println("Error: no se puede ingresar un numero menor a 1 o mayor a 100");
			flag = false;
			adivinar();
		} catch (InputMismatchException e) {
			
			System.out.println("Error: Debes ingresar un dato valido.");
			flag = false;
			
			adivinar();
			
		}
	}
	
	public static void adivinar() {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			 do{
				System.out.println("Ingrese un numero entre el 1 y 100 : ");
				int almacenador = entrada.nextInt();

				intentos++;

				if (almacenador > numeroSecreto) {
					System.out.println("el numero secreto es menor");
				} else if (almacenador < numeroSecreto) {
					System.out.println("el numero secreto es mayor");
				} else {
					System.out.println("Ganaste. lo hiciste en " + intentos + " intentos");
				}

				if (intentos == 10) {
					System.out.println("no se puede mas");
				}

				if (almacenador < 1) {
					int resultado = falla / 0;
				}

				if (almacenador > 100) {
					int resultado = falla / 0;
				}
			}while(!flag);
		}
		
	} 
	
}
