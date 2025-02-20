package mx.ipn.escom.holaSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hola")
    public String hello(Model model) {
        model.addAttribute("message", "Hola Spring");
        return "hello"; // Se refiere a un archivo hello.html en templates
    }
}
