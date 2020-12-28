package FolkNews;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ListaUtilizadores utilizador = new ListaUtilizadores();

    int opcao = 0;    
    
    do {
      menu();
      opcao = scanner.nextInt(); 
      switch(opcao) {
      case 1:
        
        break;   
      case 2:
        registarAutor(utilizador);        
        break;
      default:
        System.out.println("Opção inválida.");
      }
    } while(opcao != 0);
  }

  public static void menu() {
    System.out.println("\n");
    System.out.println("\tBem-Vindo ao FolkNews!");
    System.out.println("0. Sair");
    System.out.println("1. Entrar");
    System.out.println("2. Registar");
    System.out.println("3. Ver Artigos");
    System.out.print("Opcao: ");
  }

  // public static void menuRegisto() { 
  //   int opcao = 0;    

  //   System.out.println("\n");
  //   System.out.println("Que tipo de registo pretende?");
  //   System.out.println("1. Registo de Autor");
  //   System.out.println("2. Registo de Leitor");
  //   System.out.print("Opcao: ");
  //   opcao = scanner.nextInt();
    
  //   switch (opcao) {
  //     case 1:
  //       menuRegisto();
  //       break;

  //     case 2:
  //       registarAutor();
  //       break;
    
  //     default:
  //       break;
  //   }
  // }

  // public static void login() {
  //   String email, password;
  //   int pos;

  //   Autor a1 = new Autor();

  //   System.out.print("E-mail -> ");
  //   email = scanner.nextLine();
  //   System.out.print("Palavra-Passe -> ");
  //   password = scanner.nextLine();


  //   a1.setNome(email);
  //   pos = lista.existe(a1);
  //   if (pos == -1)
  //     {
  //       System.out.println("esse nome não existe");
  //       return(-1);
  //     }
  //   else
  //     {
  //       a1 = agenda.getContato(pos);
  //       System.out.println(a1.toString());
  //       return(pos);
  //     }
  // }
  
  public static void registarAutor(ListaUtilizadores utilizador) { 
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    
    Utilizador a1 = new Utilizador();

    scanner.nextLine();
    System.out.print("Nome e Apelido -> ");
    nome = scanner.nextLine();
    System.out.print("E-mail -> ");
    email = scanner.nextLine();
    System.out.print("Palavra-Passe -> ");
    password = scanner.nextLine();
    System.out.print("Profissão -> ");
    profissao = scanner.nextLine();
    System.out.print("Data de Nascimento -> ");
    dataNascimento = scanner.nextLine();
    System.out.print("Tema Preferêncial -> ");
    temaPreferencial = scanner.nextLine();

    a1.setNome(nome);
    a1.setEmail(email);
    a1.setPassword(password);
    a1.setProfissao(profissao);
    a1.setDataNascimento(dataNascimento);
    a1.setTemaPreferencial(temaPreferencial);

    if (utilizador.existe(a1)) {
      System.out.println("Erro");
      System.out.println(utilizador.toString());
    }
    else {
      utilizador.registoUtilizador(a1);
      System.out.println(utilizador.toString());
    }
  }
}
