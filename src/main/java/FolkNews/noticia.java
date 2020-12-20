package FolkNews;

public class noticia extends Autor {

  private String titulo;
  private String corpo;
  private String data;

  public noticia() {
    this.titulo = null;
    this.corpo = null;
    this.data = null;
  }

  public noticia(String titulo, String corpo, String data) {
    this.titulo = titulo;
    this.corpo = corpo;
    this.data = data;
  }


  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getCorpo() {
    return this.corpo;
  }

  public void setCorpo(String corpo) {
    this.corpo = corpo;
  }

  public String getData() {
    return this.data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + getTitulo() + "'" +
      ", corpo='" + getCorpo() + "'" +
      ", data='" + getData() + "'" +
      "}";
  }

  
}
