package pl.matshead.Gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/gif/{name}")
    public String getGifDetails(@PathVariable String name, ModelMap map){
        map.put("gif", new Gif(name, false, "2"));
        return "gif-details";
    }
}
