package nomenclatura;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Name {

    // ✅ Variáveis e métodos com nomes claros e descritivos
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        // implementação fictícia
        return null;
    }

    // ✅ Declarações corretas — uso de List em vez de array (mais flexível)
    public List<Account> AccountList;

    // ✅ Parâmetros sem prefixos desnecessários
    public void deleteUser(Name.User user) {
        // implementação fictícia
    }

    // ✅ Variável com nome significativo (sem abreviações)
    public URL url;

    // ✅ Classe com substantivo, método com verbo
    public class TableRepresent { }
    public void saveCar() {
        // implementação fictícia
    }

    // ✅ Uma palavra por conceito (ações diferentes têm verbos diferentes)
    public void saveUser() {
        // implementação fictícia
    }

    public void createAccount() {
        // implementação fictícia
    }

    public void generateContract() {
        // implementação fictícia
    }

    // ✅ Uso de constantes com nomes em maiúsculas e underscores
    public static final int DAYS_IN_YEAR = 360;
    public static final int HOURS_IN_WEEK = 168;

    // Classe interna User fictícia para referência
    public static class User { }

    // Classe fictícia Account e Testcase para o código compilar
    public static class Account { }
    public static class Testcase { }
}
