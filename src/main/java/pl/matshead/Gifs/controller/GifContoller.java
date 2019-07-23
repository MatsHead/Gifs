package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Gif;


@Controller
public class GifContoller {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("paths", Gif.getGifs());
        return "home";
    }

}
