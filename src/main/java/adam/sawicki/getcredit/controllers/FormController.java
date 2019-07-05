package adam.sawicki.getcredit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @PostMapping("/formshow")
    public String formGet(@RequestParam("nick") String nick,
                          @RequestParam("login") String login,
                          @RequestParam("password") String password,
                          Model model) {

        if (login.equals("adam") && password.equals("adam") && !nick.isEmpty()) {
            model.addAttribute("nick", nick);
            return "redirect:/dashboard";
        }
        model.addAttribute("error", "Podales niepoprawne dane!");
        return "index";
    }


    @GetMapping("/formshow")
    public String formGet() {
        return "index";
    }
}
