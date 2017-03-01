package application.controllers;

import application.forms.RouteForm;
import entities.Aircraft;
import entities.Airport;
import entities.Route;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@Controller
@RequestMapping("/route")
public class RoutePage {

    @RequestMapping(method = RequestMethod.GET)
    public String getInfo(RouteForm routeForm, Model model) {
        initialPage(model);
        return "route";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getRoute(@Valid RouteForm routeForm, BindingResult bindingResult, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://localhost:8080/getRoute?org=%s&des=%s&range=%s", routeForm.getOrgIata(), routeForm.getDesIata(), routeForm.getRange());
        Route route = restTemplate.getForObject(url, Route.class);
        model.addAttribute("route", String.format("%s", route));
        initialPage(model);
        return "route";
    }

    private void initialPage(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Aircraft[] aircrafts = restTemplate.getForObject("http://localhost:8080/getAircraft", Aircraft[].class);
        model.addAttribute("aircrafts", aircrafts);
        Airport[] airports = restTemplate.getForObject("http://localhost:8080/getAirport", Airport[].class);
        model.addAttribute("airports", airports);
    }

}
