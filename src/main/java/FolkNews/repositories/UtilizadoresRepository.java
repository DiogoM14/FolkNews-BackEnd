package FolkNews.repositories;

import FolkNews.entities.Utilizador;
import FolkNews.util.UtilizadoresFiltrados;

import java.util.ArrayList;
import java.util.List;

public class UtilizadoresRepository {
  private ArrayList<Utilizador> utilizadores = new ArrayList<>();
  private UtilizadoresFiltrados util = new UtilizadoresFiltrados();

  public UtilizadoresRepository() {
  }

  public boolean registoUtilizador(Utilizador user) {

    return this.utilizadores.add(user);
  }

  public Utilizador getUtilizador(int pos) {
    return this.utilizadores.get(pos);
  }

  public Utilizador getUtilizador(Utilizador user) {
    int pos;
    pos = this.utilizadores.indexOf(user);
    return this.utilizadores.get(pos);
  }

  public List<Utilizador> getUtilizadores() {
    return this.utilizadores;
  }

  public Boolean existe(String email) {  // user = a1
    System.out.println("RAPOSITORY" + this.utilizadores);
    Utilizador utilizador = util.filtrarUtilizador(getUtilizadores(), u -> u.getEmail().toLowerCase() == email);
    return this.utilizadores.contains(utilizador);
  }

  // public Utilizador getUtilizadorFiltrado(String nome) {

  //   Utilizador utilizador = util.filtrarUtilizador(getUtilizadores(), u -> u.getNome().toLowerCase() == nome);

  //   return utilizador;
  // }

  @Override
  public String toString() {
    return "Todos os utilizadores { " + utilizadores + " }";
  }
}
