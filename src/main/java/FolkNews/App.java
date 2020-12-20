package FolkNews;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // RegistarCliente();
  }
  public static void ResgistarCliente(){
    String nome, profissao, dataNascimento, temaPreferencial;
    

    Autor a1 = new Autor();
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("nome");
    nome = scanner.nextLine();
    System.out.print("profissao");
    profissao = scanner.nextLine();
    System.out.print("data de nascimento");
    dataNascimento = scanner.nextLine();
    System.out.print("tema preferencial");
    temaPreferencial = scanner.nextLine();

    a1.setNome(nome);
    a1.setProfissao(profissao);
    a1.setDataNascimento(dataNascimento);
    a1.setTemaPreferencial(temaPreferencial);

    System.out.println(a1.toString());
  }<
}
