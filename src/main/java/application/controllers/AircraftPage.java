package application.controllers;

import entities.Aircraft;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Controller
@RequestMapping("/aircraft")
public class AircraftPage {

    @RequestMapping(method = RequestMethod.GET)
    public String getAircraft(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Aircraft[] aircrafts = restTemplate.getForObject("http://localhost:8080/getAircraft", Aircraft[].class);
//        ArrayList aircraftList = new ArrayList<>();
//        for (Aircraft aircraft : aircrafts) {
//            aircraftList.add(aircraft.toString());
//        }
        model.addAttribute("aircrafts", aircrafts);
        return "aircraft";
    }
}
