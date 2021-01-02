package FolkNews.entities;

import java.util.Date;

public class Artigo extends Utilizador {

  private String titulo;
  private String resumo;
  private String corpo;
  private Date data;

  public Artigo() {
  }

  public Artigo(String titulo, String resumo, String corpo, Date data) {
    this.titulo = titulo;
    this.resumo = resumo;
    this.corpo = corpo;
    this.data = data;
  }


  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getResumo() {
    return this.resumo;
  }

  public void getResumo(String resumo) {
    this.resumo = resumo;
  }

  public String getCorpo() {
    return this.corpo;
  }

  public void setCorpo(String corpo) {
    this.corpo = corpo;
  }

  public Date getData() {
    return this.data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + getTitulo() + "'" +
      ", resumo='" + getResumo() + "'" +
      ", corpo='" + getCorpo() + "'" +
      ", data='" + getData() + "'" +
      "}";
  }

}
