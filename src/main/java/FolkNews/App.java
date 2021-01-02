package FolkNews;

import java.util.Scanner;

import FolkNews.repositories.UtilizadoresRepository;
import FolkNews.service.RegistarUtilizador;
import FolkNews.views.Menu;

public class App {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    UtilizadoresRepository utilizadorRepository = new UtilizadoresRepository(); // Instância o repo dos utilizadores
    Menu.execMenu();

    int opcao = 0;

    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          // login(utilizadorRepository);
          break;
        case 2:
          RegistarUtilizador.execRegisto(utilizadorRepository);
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
  }
}
