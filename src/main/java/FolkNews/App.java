package FolkNews;

import java.util.Scanner;

import FolkNews.entities.Utilizador;
import FolkNews.entities.enums.UserType;
import FolkNews.repositories.ListaUtilizadores;
import FolkNews.views.Menu;

public class App {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ListaUtilizadores utilizador = new ListaUtilizadores();
    Menu.execMenu();
    int opcao = 0;

    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          login(utilizador);
          break;
        case 2:
          registarAutor(utilizador);
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
  }

  public static void registarAutor(ListaUtilizadores utilizador) {
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    int tipoDeUtilizador = 0;
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
    System.out.print("Tipo de Registo (1 = EDITOR, 2 = LEITOR) -> ");
    tipoDeUtilizador = scanner.nextInt();

    while (tipoDeUtilizador != 1 && tipoDeUtilizador != 2) {
      System.out.print("Escolha o tipo de Registo entre 1 ou 2 (1 = EDITOR, 2 = LEITOR) -> ");
      tipoDeUtilizador = scanner.nextInt();
    }

    if (tipoDeUtilizador == 1) {
      UserType userTypeEnum = UserType.valueOf("EDITOR");
      a1 = new Utilizador(nome, email, password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
    } else if (tipoDeUtilizador == 2) {
      UserType userTypeEnum = UserType.valueOf("LEITOR");
      a1 = new Utilizador(nome, email, password, profissao, dataNascimento, temaPreferencial, userTypeEnum);
    }

    if (utilizador.existe(a1)) {
      System.out.println("Erro");
      System.out.println(a1.toString());
    } else {    
      boolean userRegistered = utilizador.registoUtilizador(a1);
      if(userRegistered != false){
        System.out.println(a1.toString());
      }else{
        System.out.println("Desculpa, aconteceu um erro, tente novamente mais tarde.");
      }
    }
  }

  public static void login(ListaUtilizadores utilizador) {
    String email, password;

    Utilizador a1 = new Utilizador();

    scanner.nextLine();
    System.out.print("E-mail -> ");
    email = scanner.nextLine();
    System.out.print("Palavra-Passe -> ");
    password = scanner.nextLine();

    a1.setNome(email);
    a1.setPassword(password);
  }
}
