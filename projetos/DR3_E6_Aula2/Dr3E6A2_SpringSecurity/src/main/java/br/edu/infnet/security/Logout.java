package br.edu.infnet.security;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Logout {

    @RequestMapping("/logout")
    public String logout(HttpSession sessao) {

        sessao.invalidate();
        return "index";
    }
}
