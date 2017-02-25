package application.controllers;

import entities.Aircraft;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/aircraft")
public class AircraftPage {

    @RequestMapping(method = RequestMethod.GET)
    public String getAircraft(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Aircraft[] aircrafts = restTemplate.getForObject("http://localhost:8080/getAircraft", Aircraft[].class);
        model.addAttribute("aircrafts", aircrafts);
        return "aircraft";
    }
}
