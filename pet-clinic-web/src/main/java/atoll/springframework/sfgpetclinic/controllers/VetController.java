package atoll.springframework.sfgpetclinic.controllers;

import atoll.springframework.sfgpetclinic.model.Vet;
import atoll.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","/vets/","/vets/index","/vets/index.html","/vets.html"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/vetList";
    }

    @GetMapping("/api/vets")
    public @ResponseBody Set<Vet> getVetsJson(){

        return vetService.findAll();
    }
}
