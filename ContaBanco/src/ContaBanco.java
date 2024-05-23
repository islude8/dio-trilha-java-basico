
import java.util.Scanner;
 
    public class ContaBanco   {  
       
            private static final int String = 0;

            /**
             * @param args
             */
            public static void main (String[] args)

           {
        
        Scanner chamandoScanner = new Scanner(System.in);

        
         System.out.println("Olá ! Bem vindo a agência bancária Fulano !");
        System.out.println("Informe seu nome: ");
        String nomeFulano = chamandoScanner.nextLine();

       
        System.out.println("Informe o número da conta:");
        String conta = chamandoScanner.nextLine();
         
        System.out.println("Agora, informe o número de sua agência: ");
         String agencia = chamandoScanner.nextLine();

         System.out.println("Agora, informe o valor de seu depósito: ");
         String saldo = chamandoScanner.nextLine();

          
        chamandoScanner.close();

        System.out.println("Olá !" + nomeFulano + " Sua contá é " + conta + "e sua agência é " + agencia + " e seu saldo é de: " + saldo +" R$ disponíveis.");
           
       
       
        

    };
};

