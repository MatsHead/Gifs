package pl.matshead.Gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/")
    public String home(@RequestParam(required = false) String q, ModelMap modelMap){
        gifRepository.checkAndPutToMap(modelMap,q, gifRepository.getGifs());
        return "home";
    }
}
