package FolkNews;

import java.util.ArrayList;

public class ListaUtilizadores {
  private ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

  public ListaUtilizadores() {

  }

  public void registoUtilizador(Utilizador user) {
    this.utilizadores.add(user);
  }
  
  public ArrayList<Utilizador> getUtilizadores() {
    return this.utilizadores;
  }
  
  public void setUtilizadores(ArrayList<Utilizador> utilizadores) {
    this.utilizadores = utilizadores;
  }

  public boolean existe(Utilizador user) {
    return this.utilizadores.contains(user);
  }

  @Override
  public String toString() {
    return "{" +
      " utilizadores='" + getUtilizadores() + "'" +
      "}";
  }

}
