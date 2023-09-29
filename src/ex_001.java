import java.util.Scanner;

public class ex_001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int senhaUsuario = sc.nextInt();

        while (senhaUsuario != senha) {
            System.out.println("Senha Inválida");
            senhaUsuario = sc.nextInt();
        }
        System.out.print("Acesso Permitido");

        sc.close();
    }
}
