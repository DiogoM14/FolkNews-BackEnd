package FolkNews.entities;

import java.util.Objects;
import FolkNews.entities.enums.UserType;

public class Utilizador {
    private String nome;
    private String email;
    private String password;
    private String profissao;
    private String dataNascimento;
    private String temaPreferencial;
    private UserType userType;

    public Utilizador() {
    }

    public Utilizador(String nome, String email, String password, String profissao, String dataNascimento,
            String temaPreferencial, UserType userType) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.profissao = profissao;
        this.dataNascimento = dataNascimento;
        this.temaPreferencial = temaPreferencial;
        this.userType = userType;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTemaPreferencial() {
        return this.temaPreferencial;
    }

    public void setTemaPreferencial(String temaPreferencial) {
        this.temaPreferencial = temaPreferencial;
    }

    public UserType getUserType() {
        return this.userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", email='" + getEmail() + "'" + ", profissao='" + getProfissao()
                + "'" + ", dataNascimento='" + getDataNascimento() + "'" + ", temaPreferencial='"
                + getTemaPreferencial() + "'" + ", userType='" + getUserType() + "'" + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Utilizador)) {
            return false;
        }
        Utilizador utilizador = (Utilizador) o;
        return Objects.equals(nome, utilizador.nome) && Objects.equals(email, utilizador.email)
                && Objects.equals(password, utilizador.password) && Objects.equals(profissao, utilizador.profissao)
                && Objects.equals(dataNascimento, utilizador.dataNascimento)
                && Objects.equals(temaPreferencial, utilizador.temaPreferencial)
                && Objects.equals(userType, utilizador.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, password, profissao, dataNascimento, temaPreferencial, userType);
    }

}
