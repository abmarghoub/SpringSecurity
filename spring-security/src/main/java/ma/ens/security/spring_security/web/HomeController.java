package ma.ens.security.spring_security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // correspond à login.html dans templates
    }

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Page d'accueil accessible après connexion.";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "Espace utilisateur - accessible aux rôles USER et ADMIN. <br><a href='/logout'>Logout</a>";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Espace administrateur - réservé au rôle ADMIN. <br><a href='/logout'>Logout</a>";
    }
}
