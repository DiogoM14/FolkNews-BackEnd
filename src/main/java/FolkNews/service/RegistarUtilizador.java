package FolkNews.service;

import java.util.Scanner;

import FolkNews.entities.Utilizador;
import FolkNews.entities.enums.UserType;
import FolkNews.repositories.UtilizadoresRepository;
import FolkNews.views.Menu;

public class RegistarUtilizador {
  static Scanner scanner = new Scanner(System.in);

  private RegistarUtilizador() {}

  public static void execRegisto(UtilizadoresRepository utilizador) {
    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    int tipoDeUtilizador = 0;
    Utilizador a1 = new Utilizador(); // Instância o modelo da entidade utilizador

    // Formulário -------------------------------------------------------
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
    // ----------------------------------------------------------------

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
      System.out.println(utilizador.toString());
      Menu.execMenu();
    } else {
      boolean userRegistered = utilizador.registoUtilizador(a1);
      if (userRegistered != false) {
        System.out.println(a1.toString());
        System.out.println(utilizador.getUtilizadores());
        System.out.println(utilizador.getUtilizadorFiltrado(a1));
        Menu.execMenu();
      } else {
        System.out.println("Desculpa, aconteceu um erro, tente novamente mais tarde.");
      }
    }
  }
}
