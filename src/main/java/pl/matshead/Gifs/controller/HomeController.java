package pl.matshead.Gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;


@Controller
public class HomeController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("paths", gifRepository.getGifs());
        return "home";
    }
}
