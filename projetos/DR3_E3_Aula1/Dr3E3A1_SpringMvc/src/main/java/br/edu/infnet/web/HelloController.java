package br.edu.infnet.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    
    @RequestMapping("/helloSimples")
    public String helloSimples() {
        
        System.out.println("Passei pelo Controller do Spring MVC!");
        return "index";
    }
    
    @RequestMapping("/helloMensagem")
    public ModelAndView helloMensagem() {

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("mensagem", "Hello Spring MVC World!!!!");
        return mav;
    }
}
