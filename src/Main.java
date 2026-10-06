import java.util.Scanner;

public class Main {
    public static int funcion(int numero) {
        int numeroImpar = 1, suma = 0;
        for (int i = 0; i < numero; i++) {
            suma = suma + numeroImpar;
            numeroImpar = numeroImpar + 2;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Teclea un número y yo te mostraré su cuadrado");
        numero = sc.nextInt();
        resultado = funcion(numero);
        System.out.println("El cuadrado de " + numero + " es " + resultado);

    }
}