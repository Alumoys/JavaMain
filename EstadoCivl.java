import java.util.Scanner;

//Progama de verificar estado civil
public class EstadoCivl{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Lendo os dados da pessoa
        System.out.print("Digire o seu nome:");
        String nome = sc.nextLine();

        System.out.print("Digite seu sexo (M/ F):");
        String sexo = sc.nextLine().toUpperCase();// Convertendo para maiúsculo para facilitar a comparação

        System.out.print("Digite o estado civil:");
        String estadocivil = sc.nextLine();

//        Verificando se a pessoa é casada ou não
        if (estadocivil.equals("casada") ||  estadocivil.equals("casado")){
            System.out.print("Há quantos anos está casado(a)?");
            int tempoCasamento = sc.nextInt();
            System.out.println(String.format("Você está %s há %d anos.",estadocivil ,tempoCasamento));
        }else {
            System.out.println("Sem informações adicionais.");
        }
        sc.close();
    }
    
}
