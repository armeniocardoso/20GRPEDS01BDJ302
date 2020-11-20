package br.edu.infnet.address;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {
    
    @Autowired
    private CountryRepository countryRepository;
    
    @RequestMapping("/countries/listar")
    public ModelAndView listarAtores() {
        
        ModelAndView retorno = new ModelAndView("countries/index");
        List<Country> countryList = countryRepository.listar();
        if(countryList != null && !countryList.isEmpty()) {
            
            retorno.addObject("countries", countryList);
        } else {
            
            retorno.addObject("message", "Não existem dados para exibir");
        }
        return retorno;
    }
    
    @RequestMapping("/countries/cadastrar")
    public ModelAndView cadastrar(String pais, String cidades) {
        
        ModelAndView mav = new ModelAndView("countries/manter");
        if(pais != null 
                && pais.length() > 0 
                && cidades != null 
                && cidades.length() > 0) {
            
            Country country = new Country();
            country.setCountry(pais);
            country.setLastUpdate(new Date());
            String [] listaCidades = cidades.split(";");
            ArrayList<City> cities = new ArrayList<>();
            for (String cidade : listaCidades) {
                
                City city = new City();
                city.setCity(cidade);
                //Cidade conhece País
                city.setCountryId(country);
                city.setLastUpdate(new Date());
                cities.add(city);
            }
            //País conhece as cidades
            country.setCityList(cities);
            countryRepository.inserir(country);
            mav.addObject("message", "País inserido com sucesso");            
        }
        return mav;
    }
}
