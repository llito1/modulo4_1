import java.util.Scanner;
public class listadocompra {
    public static void main(String[] args) {

        double cocina = 299990;
        double lavadora = 234540;
        double comedor = 159990;
        double televisor = 345100;


        double total = cocina + lavadora + comedor + televisor;


        double iva = total * 0.19;


        double totalConIva = total + iva;


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del dólar: ");
        double dolar = sc.nextDouble();


        double totalEnDolares = totalConIva / dolar;


        System.out.println("Total sin IVA: $" + total);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total con IVA: $" + totalConIva);
        System.out.println("Total en dólares: $" + totalEnDolares);

        sc.close();
    }
}

