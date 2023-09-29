import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int combustivelCliente = sc.nextInt();

//        COMO EU FIZ:
        while (combustivelCliente != 0) {
            if (combustivelCliente > 4) {
                System.out.print("Solicite um novo código: ");
            } else if (combustivelCliente == 1) {
                alcool++;

            } else if (combustivelCliente == 2) {
                gasolina++;

            } else if (combustivelCliente == 3) {
                diesel++;
            } else {
                System.out.println("Muito obrigado");
                break;
            }
            combustivelCliente = sc.nextInt();

        }
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        sc.close();
    }
}

// COMO PODERIA SER ESCREVENDO MENOS:
//Scanner sc = new Scanner(System.in);
//
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//
//		int tipo = sc.nextInt();
//
//		while (tipo != 4) {
//			if (tipo == 1) {
//				alcool = alcool + 1;
//			}
//			else if (tipo == 2) {
//				gasolina = gasolina + 1;
//			}
//			else if (tipo == 3) {
//				diesel = diesel + 1;
//			}
//
//			tipo = sc.nextInt();
//		}
//
//		System.out.println("MUITO OBRIGADO");
//		System.out.println("Alcool: " + alcool);
//		System.out.println("Gasolina: " + gasolina);
//		System.out.println("Diesel: " + diesel);
//
//		sc.close();