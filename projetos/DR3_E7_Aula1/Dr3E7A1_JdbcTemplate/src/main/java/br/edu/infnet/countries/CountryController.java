package br.edu.infnet.countries;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/countries/listAll")
    public ModelAndView listAll() {

        ModelAndView mav = new ModelAndView("countries/index");
        List<Country> list = countryRepository.listAll();
        if (list != null && !list.isEmpty()) {

            mav.addObject("countries", list);
        } else {

            mav.addObject("message", "Não existem dados para exibir");
        }
        return mav;
    }
}
