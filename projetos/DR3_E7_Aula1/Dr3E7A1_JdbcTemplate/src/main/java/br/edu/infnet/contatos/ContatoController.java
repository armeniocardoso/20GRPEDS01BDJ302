package br.edu.infnet.contatos;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @RequestMapping("/contatos/listar")
    public ModelAndView listar() {

        ModelAndView retorno = new ModelAndView("contatos/index");
        List<Contato> lista = contatoRepository.listar();
        if (lista != null && !lista.isEmpty()) {

            retorno.addObject("contatos", lista);
        } else {

            retorno.addObject("mensagem", "Não existem dados para exibir");
        }
        return retorno;
    }

    @RequestMapping("/contatos/obter")
    public ModelAndView obter(Integer id) {

        ModelAndView retorno = new ModelAndView("contatos/index");
        retorno.addObject("contato", contatoRepository.obter(id));
        return retorno;
    }

    @RequestMapping("/contatos/salvar")
    public ModelAndView salvar(@Valid Contato contato, BindingResult br) {

        ModelAndView retorno = new ModelAndView("contatos/index");
        if (!br.hasErrors()) {
            if (contato != null && contato.getId() == null) {

                contatoRepository.inserir(contato);
            } else {

                contatoRepository.alterar(contato);
            }
            retorno.addObject("contato", null);
            retorno.addObject("contatos", contatoRepository.listar());
        } else {
            
            retorno.addObject("erros", br.getFieldErrors());
        }
        return retorno;
    }
}
