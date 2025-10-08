package function;

import org.springframework.web.bind.annotation.PostMapping;
import java.util.Date;

public class Functions {

    // ✅ Faça somente 1 coisa (cada método salva apenas um tipo de dado)
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    // ✅ Somente 1 nível de abstração (chama apenas o service, não o repository diretamente)
    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }

    // ✅ Argumentos: apenas o necessário (evitar parâmetros desnecessários)
    public void saveUserSimple(User user) {
        // implementação fictícia
    }

    // ✅ No side effects (método faz apenas uma coisa: salvar o usuário)
    public User saveUser(User user) {
        if (user.isAdmin) {
            user.setRole(user);
        }
        return userRepository.save(user);
    }

    // ✅ Evite duplicados, extraindo lógica repetida em um método auxiliar
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }

    // Classes e dependências fictícias para permitir compilação
    private IncomeRepository inRepo;
    private ExpenseRepository outRepo;
    private UserService userService;
    private UserRepository userRepository;
    private VersionService versionService;
    private EnvironmentService environmentService;
    private ReleaseService releaseService;

    // Classes placeholder simuladas
    public static class Income {}
    public static class Expense {}
    public static class User {
        public boolean isAdmin;
        public void setRole(User user) {}
    }
    public static class Environment {}
    public static class Release {}
    public static class IncomeRepository { public void save(Income i) {} }
    public static class ExpenseRepository { public void save(Expense e) {} }
    public static class UserService { public User save(User u) { return u; } }
    public static class UserRepository { public User save(User u) { return u; } }
    public static class VersionService { public String getVersion() { return "1.0"; } }
    public static class EnvironmentService { public Environment getEnvironment(String v) { return new Environment(); } }
    public static class ReleaseService { public Release getRelease(String v) { return new Release(); } }
}
