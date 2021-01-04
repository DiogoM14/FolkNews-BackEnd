package FolkNews.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FolkNews.entities.Utilizador;
import FolkNews.entities.enums.UserType;
import FolkNews.repositories.UtilizadoresRepository;
import FolkNews.views.Menu;

public class RegistarUtilizador {
  Scanner scanner = new Scanner(System.in);

  List<Utilizador> utilizadores = new ArrayList<>();
  UtilizadoresRepository utilizadorRepository = new UtilizadoresRepository(utilizadores);

  public void execRegisto() {

    String nome, email, password, profissao, dataNascimento, temaPreferencial;
    int tipoDeUtilizador = 0;
    Utilizador a1 = new Utilizador(); // Instância o modelo da entidade utilizador

    // Formulário -------------------------------------------------------
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
    // ----------------------------------------------------------------

    if (utilizadorRepository.existe(a1)) {
      // Se existe 
      // System.out.println("Utilizador filtrado " + utilizadorRepository.getUtilizadorFiltrado(a1.getNome()));
      System.out.println("Este E-mail já se encontra registado. Tente novamente!");
      Menu.execMenu();
    } else {
      // Se não existe
      utilizadorRepository.registoUtilizador(a1);

      System.out.println(a1.toString());
      System.out.println("Todos os utilizadores " + utilizadorRepository.getUtilizadores());
      Menu.execMenu();
    }
  }
}
