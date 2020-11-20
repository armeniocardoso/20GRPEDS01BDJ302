package br.edu.infnet.fornecedores;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FornecedorController {

    @RequestMapping("/fornecedores/cadastrar")
    public ModelAndView cadastrar(@Valid Fornecedor fornecedor, BindingResult br) {
        
        ModelAndView retorno = new ModelAndView("fornecedores/index");
        if(!br.hasErrors()) {

            retorno.addObject("sucesso", 
                    String.format("O Fornecedor %s foi cadastrado com sucesso.", 
                            fornecedor.getNomeFantasia()));                        
        } else {
            
            retorno.addObject("erros", br.getFieldErrors());
        }
        return retorno;
    }
}
