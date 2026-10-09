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

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}