package cadastroava3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int numRegistros;

	      System.out.println("Quantos registros deseja cadastrar? ");
	      numRegistros = sc.nextInt();
	      sc.nextLine();
		  //Parte Luan Araujo
		  String[] nomes = new String[numRegistros];
		  String[] rg = new String[numRegistros];
		  String[] cpf = new String[numRegistros];
		  int[] nascimento = new int[numRegistros];
		  String[] email = new String[numRegistros];
		  String[] telefone = new String[numRegistros];
		  String[] login = new String[numRegistros];
		  String[] senha = new String[numRegistros];
		  String[] apartamento = new String[numRegistros];
		  String[] bloco = new String[numRegistros]; 

		//parte leo zequini
		Morador morador=new Morador();
        System.out.print("Nome: ");
        morador.setNome(scanner.nextLine());

        System.out.print("RG: ");
        morador.setRg(scanner.nextLine());

        System.out.print("CPF: ");
        morador.setCpf(scanner.nextLine());

        System.out.print("Data de Nascimento: ");
        morador.setDataNascimento(scanner.nextLine());

        System.out.print("E-mail: ");
        morador.setEmail(scanner.nextLine());

        System.out.print("Telefone: ");
        morador.setTelefone(scanner.nextLine());

        System.out.print("Apartamento: ");
        morador.setApartamento(scanner.nextLine());

        System.out.print("Bloco: ");
        morador.setBloco(scanner.nextLine());

	}

}
// Parte Juliana
System.out.println("Telefone: ");
            telefone[i] = sc.nextLine();

            System.out.println("Login: ");
            login[i] = sc.nextLine();

            System.out.println("Senha: ");
            senha[i] = sc.nextLine();

            System.out.println("Apartamento: ");
            apartamento[i] = sc.nextLine();

            System.out.println("Bloco: ");
            bloco[i] = sc.nextLine();
   }
   System.out.println("\nRegistros cadastrados:");

  // Parte Laura 
System.out.println("----- Moradores Cadastrados -----");
 for (int i = 0; i < numMoradores; i++) {
 System.out.println("Morador #" + (i + 1));
 System.out.println("Nome: " + moradores[i].getNome());
 System.out.println("RG: " + moradores[i].getRg());
 System.out.println("CPF: " + moradores[i].getCpf());
 System.out.println("Data de Nascimento: " + moradores[i].getDataNascimento());
 System.out.println("E-mail: " + moradores[i].getEmail());
 System.out.println("Telefone: " + moradores[i].getTelefone());
 System.out.println("Apartamento: " + moradores[i].getApartamento());
 System.out.println("Bloco: " + moradores[i].getBloco());
 System.out.println("------------------------");
 }
 scanner.close();

