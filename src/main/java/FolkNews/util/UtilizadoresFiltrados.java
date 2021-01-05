package FolkNews.util;

import java.util.List;
import java.util.function.Predicate;

import FolkNews.entities.Utilizador;

public class UtilizadoresFiltrados {

    public Utilizador filtrarUtilizador(List<Utilizador> email, Predicate<Utilizador> criterio) {
        System.out.println("asdasdasdasd" + email);
        for (Utilizador utilizador : email) {
            if (criterio.test(utilizador)) {
                return utilizador;
            }
        }

        return null;
    }

}