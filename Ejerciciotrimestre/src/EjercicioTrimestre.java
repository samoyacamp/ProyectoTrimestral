import java.util.Scanner;

// Ir hacia abajo

// for (int i = fila - 1; i < matriz.length; i++)
// Ir hacia arriba
// for (int i = fila + 1; i > 0; i--)

import java.util.Scanner;

public class EjercicioTrimestre {
	private static final String printMatrix = null;

// Imprime la matriz
	private static void printMatrix(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
		;

	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] matriz = new char[10][10];

// Genera la matriz.
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				int n = (int) (Math.random() * 2);
				switch (n) {
				case 1:
					matriz[i][j] = 'X';
					break;
				default:
					matriz[i][j] = '.';
					break;
				}
			}
		}
//Esto es para la H 
		System.out.println("dame la fila: ");
		int fila = sc.nextInt();
		System.out.println("dame la columna: ");
		int columna = sc.nextInt();
//Ande esta el heroeee, aquiii
		matriz[fila][columna] = 'H';
//Pedir aqui la direccion, 
		printMatrix(matriz);
		System.out.println();
		System.out.println("Empieza el loop ->");
		int filesToX = 0;
		char letra = 'P';
		boolean enemigo = false;

		enemigo = false;
		System.out.println("\nHacia que direccion mira? (R, L, U, D). X para salir.");
		letra = sc.next().charAt(0);

		switch (letra) {
		case 'U':
			for (int i = fila - 1; i < matriz.length; i++) {
				System.out.println(matriz[i][columna]);
				if (matriz[i][columna] == 'X') {
					// pa aclarame que no me entero
					System.out.println("X mas proxima, gañan " + i + " ," + fila);
					System.out.println("Casillas hasta la X: " + filesToX);
					break;
				}
				// cuando ha encontrado la X la imprime, sencillo mas o menos
				else {
					filesToX++;
				}
			}
		case 'D':
			for (int i = fila + 1; i > 0; i--) {
				if (matriz[i][columna] == 'X') {
					System.out.println("X mas proxima, gañan " + i + " ," + fila);
					System.out.println("Casillas hasta la X: " + filesToX);
					break;
				}
			}
		case 'L':
			for (int i = columna + 1; i > 0; i--) {
				System.out.println(matriz[i][columna]);
				if (matriz[i][fila] == 'X') {
					// pa aclarame que no me entero
					System.out.println("X mas proxima, gañan " + i + " ," + columna);
					System.out.println("Casillas hasta la X: " + filesToX);
					break;
				}

			}
		case 'R':
			for (int i = columna + 1; i < columna; i--) {
				System.out.println(matriz[i][columna]);
				if (matriz[i][fila] == 'X') {
					// pa aclarame que no me entero
					System.out.println("X mas proxima, gañan " + i + " ," + columna);
					System.out.println("Casillas hasta la X: " + filesToX);
					break;

				}
			}
		}
	}
}