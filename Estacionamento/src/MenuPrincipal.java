import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.commons.codec.digest.DigestUtils;
public class MenuPrincipal{
 int menu1(){
		int x = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("=============SISTEMA ESTACIONAMENTO======================");
		System.out.println("1 - ACESSAR O SISTEMA");
		System.out.println("0 - SAIR");
		x = ler.nextInt();
		return x;
		}
 int menu2(){
		int a=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("=============MENU CADASTRAR USUARIO E RELATORIO======================");
		System.out.println("1 - Cadastrar novo usuário");
		System.out.println("2 - Contas ");
		System.out.println("3 - Relatório Final");
		System.out.println("4 - Sair");
		a = ler.nextInt();
		
		return a;
	}
 int menu3(){
		int b=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("=============MENU CADASTRAR CONTA======================");
		System.out.println("1 - Cadastrar Conta");
		System.out.println("2 - Alterar Conta");
		System.out.println("3 - Excluir Conta");
		System.out.println("4 - Consultar conta (Digite o nome do cliente) ou (Digite  Placa do veiculo) ");
		System.out.println("5 - Fechar conta");
		System.out.println("6 - Relatorio do Veiculo no Estacionamento");
		System.out.println("7 - Total de Diarias pagas");
		System.out.println("8 - Voltar ao Menu Principal");
		b = ler.nextInt();
		
		return b;
	}
		public static void main(String args[]){
			int i=1, b=1;
			int j=0, cont=0;
			int x=0;
			
			//Funcionario[] usuarios;
		
		try{
			Scanner ler = new Scanner(System.in);
			LinkedList<Funcionario> usuario = new LinkedList();
			FileReader arquivo = new FileReader("usuario.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha = lerArquivo.readLine();
			while (linha != null) {

				StringTokenizer st = new StringTokenizer(linha, ",");
				Funcionario fu = new Funcionario();

				fu.setLogin(st.nextToken());
				fu.setSenha(st.nextToken());
				fu.setNivel(st.nextToken());

				usuario.add(fu);
				linha = lerArquivo.readLine();
			}
			//lerArquivo.close();
			for( i=0; i<usuario.size(); i++){
				usuario.get(0).setNome("Joao Carlos");
				usuario.get(0).setCpf("007.543.456-89");
				usuario.get(1).setNome("Pedro Feliphe");
				usuario.get(1).setCpf("012.233.654-09");
			
			}
			lerArquivo.close();
			MenuPrincipal m = new MenuPrincipal();
			
			x = m.menu1();
			while(x!=0){
				 	switch(x){
				 	case 1:
				 		System.out.println("Para acessar o sistema digite o (Login) e(Senha) e Data Atual");
				 		
						System.out.printf("LOGIN: \n");
						String login = ler.next();
		
				 		Funcionario fu = new Funcionario();
				 		j=0;
				 		for(i =0; i<usuario.size(); i++){
				 			if(login.compareTo(usuario.get(i).getLogin()) == 0) {
				 				j=1;
				 				fu = usuario.get(i);
				 				
								// System.out.println(f.getSenha());
								System.out.printf("SENHA: \n");
								String senhaAtual = ler.next(); 
		
								boolean aceita = fu.autenticar(senhaAtual);	
				 				if(aceita){
				 					System.out.println("Digite a data de hoje ");
				 					String data = ler.next();
				 					int a = m.menu2();
				 					while(a!=4){
				 						
				 						switch(a){
				 						case 1: 
				 							if(usuario.get(i).getNivel().compareTo("administrador")==0){
				 								Funcionario cadastrar = new Funcionario();
				 								//System.out.println("Digte o Nome");
				 								//cadastrar.setNome(ler.next());
				 								//System.out.println("Digte o CPF");
				 								//cadastrar.setCpf(ler.next());
				 								System.out.println("Digte o seu E-mail que sera seu login");
				 								cadastrar.setLogin(ler.next());
				 								System.out.println("Digte Sua Senha");
				 								String senhaAtualMD5 = DigestUtils.md5Hex(ler.next());
												cadastrar.setSenha(senhaAtualMD5);
												System.out.println("Nível de acesso - (Digite 1 para Administrador ou 2 para Funcionário): ");
												if (ler.nextInt() == 1) {
													cadastrar.setNivel("administrador");
													System.out.println("Novo usuário cadastrado com sucesso !!!");
												}
												else if (ler.nextInt() == 2) {
													cadastrar.setNivel("funcionario");
													System.out.println("Novo usuário cadastrado com sucesso !!!");
												}
												
												else System.out.println("Opção Incorreta");				
	
												usuario.add(cadastrar);
												System.out.println("gravando arquivo1");
												FileWriter arquivo1 = new FileWriter("usuario.txt", true);
												PrintWriter gravarArquivo = new PrintWriter(arquivo1);
												gravarArquivo.print(cadastrar.getLogin());
												System.out
														.println(cadastrar.getLogin());
												gravarArquivo.print(",");
												gravarArquivo.print(senhaAtualMD5);
												gravarArquivo.print(",");
												gravarArquivo.println(cadastrar.getNivel());
												gravarArquivo.close();
												break;
				 							}
				 						//break;
				 						default: System.out.println("Autorização negada esta opção e so para o Administrador!!!");
										a = m.menu2();
										
				 						case 2:
				 							b = m.menu3();
				 							while(b!=8){
				 								switch(b){
				 								
				 								}
				 							}
				 						}
				 					}
				 				}
				 			}
				 		}
				 }
				 	x = m.menu1();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}