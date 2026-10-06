import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Teclea un número y yo te mostraré su cuadrado");
        numero = sc.nextInt();
        resultado = funcion(numero);
        System.out.println("El cuadrado de " + numero + " es " + resultado);
    }
}