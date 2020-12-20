package FolkNews;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    String nome, profissao, dataNascimento, temaPreferencial;

    Scanner scanner = new Scanner(System.in);
    Autor a1 = new Autor();

    System.out.println("Introduza o nome -> ");
    nome=scanner.nextLine();
    System.out.println("Introduza o profissao -> ");
    profissao=scanner.nextLine();
    System.out.println("Introduza o dataNascimento -> ");
    dataNascimento=scanner.nextLine();
    System.out.println("Introduza o temaPreferencial -> ");
    temaPreferencial=scanner.nextLine();

    a1.setNome(nome);
    a1.setProfissao(profissao);
    a1.setDataNascimento(dataNascimento);
    a1.setTemaPreferencial(temaPreferencial);

    System.out.println(a1.toString());
  }
}
