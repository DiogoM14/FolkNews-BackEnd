package FolkNews.repositories;

import FolkNews.entities.Utilizador;
import FolkNews.entities.enums.UserType;
import FolkNews.util.UtilizadoresFiltrados;

import java.util.ArrayList;
import java.util.List;

public class UtilizadoresRepository {
  private List<Utilizador> utilizadores;
  private UtilizadoresFiltrados util = new UtilizadoresFiltrados();

  public UtilizadoresRepository(List<Utilizador> utilizadores) {
    this.utilizadores = utilizadores;
  }

  public boolean registoUtilizador(Utilizador user) {
    boolean foiRegistado = this.utilizadores.add(user);

    return foiRegistado;
  }

  public boolean existe(Utilizador user) {
    boolean seExiste = this.utilizadores.contains(user);

    if (seExiste) {
      return true;
    }

    return false;
  }

  // GETTER AND SETTER
  public List<Utilizador> getUtilizadores() {
    return this.utilizadores;
  }

  public Utilizador getUtilizadorFiltrado(String nome) {

    Utilizador utilizador = util.filtrarUtilizador(getUtilizadores(), u -> u.getNome().toLowerCase() == nome);

    return utilizador;
  }

  public void setUtilizadores(List<Utilizador> utilizadores) {
    this.utilizadores = utilizadores;
  }
}
