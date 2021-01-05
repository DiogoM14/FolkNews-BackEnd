// package FolkNews.service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import FolkNews.entities.Utilizador;
// import FolkNews.entities.enums.UserType;
// import FolkNews.views.Menu;
// import FolkNews.repositories.UtilizadoresRepository;


// public class LogarUtilizador {
//   Scanner scanner = new Scanner(System.in);

//   List<Utilizador> utilizadores = new ArrayList<>();
//   UtilizadoresRepository utilizadorRepository = new UtilizadoresRepository(utilizadores);

//   public void execLogin() {

//     String email, password;
//     Boolean existe;
//     Utilizador a1 = new Utilizador(); // Instância o modelo da entidade utilizador

//     // Formulário -------------------------------------------------------
//     scanner.nextLine();
//     System.out.print("E-mail -> ");
//     email = scanner.nextLine();
//     System.out.print("Palavra-Passe -> ");
//     password = scanner.nextLine();
//     // ----------------------------------------------------------------
    
//     a1.setEmail(email);
//     existe = utilizadorRepository.existe(a1);
    

//     if (existe) {
//       // Se existe 

//       // System.out.println("Utilizador filtrado " + utilizadorRepository.getUtilizadorFiltrado(a1.getNome()));
//       System.out.println("Entrou no Sistema");
//       Menu.execMenu();
//     } else {
//       // Se não existe
//       System.out.println("Conta inexistente, efetue um registo!");
//       Menu.execMenu();
//     }
//   }
// }
