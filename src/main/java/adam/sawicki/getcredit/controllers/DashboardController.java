package adam.sawicki.getcredit.controllers;

import adam.sawicki.getcredit.models.RequestForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("formRequest", new RequestForm());
        return "dashboard";
    }


    @PostMapping("/dashboard")
    public String dashboard(@ModelAttribute("formRequest") RequestForm form, Model model) {
        model.addAttribute("infoCredit", form );
        return "dashboard";
    }
}
