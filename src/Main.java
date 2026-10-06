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

    }
}