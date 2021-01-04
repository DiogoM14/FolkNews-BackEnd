package FolkNews.util;

import java.util.List;
import java.util.function.Predicate;

import FolkNews.entities.Utilizador;

public class UtilizadoresFiltrados {

    public Utilizador filtrarUtilizador(List<Utilizador> list, Predicate<Utilizador> criteria) {
        for (Utilizador utilizador : list) {
            if (criteria.test(utilizador)) {
                return utilizador;
            }
        }

        return null;
    }

}
