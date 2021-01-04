package FolkNews;

import java.util.Scanner;

import FolkNews.service.LogarUtilizador;
import FolkNews.service.RegistarUtilizador;
import FolkNews.views.Menu;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Menu.execMenu();

    LogarUtilizador login = new LogarUtilizador();
    RegistarUtilizador registar = new RegistarUtilizador();

    int opcao = 0;

    do {
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          login.execLogin();
          break;
        case 2:
          registar.execRegisto();
          break;
        default:
          System.out.println("Opção inválida.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}
