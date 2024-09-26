import java.util.Scanner;

public class CalculaImc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();


        double imc = peso / (altura * altura);


        System.out.println("Su IMC es: " + imc);

        sc.close();
    }
}
