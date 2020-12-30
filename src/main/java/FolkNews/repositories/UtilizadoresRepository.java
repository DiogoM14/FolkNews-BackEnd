package FolkNews.repositories;

import FolkNews.entities.Utilizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class UtilizadoresRepository {
  private List<Utilizador> utilizadores = new ArrayList<>();

  public UtilizadoresRepository() {
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

  public Utilizador getUtilizadorFiltrado(Utilizador user) {

    int userFiltered = this.utilizadores.indexOf(user);

    return this.utilizadores.get(userFiltered);

  }

  public void setUtilizadores(List<Utilizador> utilizadores) {
    this.utilizadores = utilizadores;
  }
}
