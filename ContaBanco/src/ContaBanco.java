
import java.util.Scanner;

public class ContaBanco {
    
        int agenciaBancaria = 1021;
        String contaBancaria = "067-8";
        String nomeDoCliente = "Mario Andrade";
        long saldoBancario = 273.48;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Entre com Agência: ");
       contaBancaria = input.nextLine();
       System.out.println("Olá "  + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaBancaria ", conta "  + contaBancaria + ", e seu saldo" + saldoBancario + ", já está disponível para saque.");
        

    }
}
