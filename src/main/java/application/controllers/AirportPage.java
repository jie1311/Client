package application.controllers;

import entities.Airport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/airport")
public class AirportPage {

    @RequestMapping(method = RequestMethod.GET)
    public String getAircraft(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Airport[] airports = restTemplate.getForObject("http://localhost:8080/getAirport", Airport[].class);
        model.addAttribute("airports", airports);
        return "airport";
    }
}
