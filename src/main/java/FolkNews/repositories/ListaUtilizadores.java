package FolkNews.repositories;

import FolkNews.entities.Utilizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaUtilizadores {
  private List<Utilizador> utilizadores = new ArrayList<>();

  public ListaUtilizadores() {
  }

  public boolean registoUtilizador(Utilizador user) {
    boolean foiRegistado = this.utilizadores.add(user);;
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

  public Utilizador getUtilizadorPorEmail(String email) {
    Utilizador user = this.utilizadores.stream().filter(x -> x.getEmail() == email).findFirst();

    return user;
  }

  public void setUtilizadores(List<Utilizador> utilizadores) {
    this.utilizadores = utilizadores;
  }

  @Override
  public String toString() {
    return "{" + " utilizadores='" + getUtilizadores() + "'" + "}";
  }
}
