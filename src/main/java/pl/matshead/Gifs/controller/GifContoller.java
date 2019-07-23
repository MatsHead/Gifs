package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Gif;


@Controller
public class GifContoller {
    @GetMapping("/")
    public String home(ModelMap modelMap){
        Gif gif = new Gif();
        modelMap.put("paths", gif.getGifs());
        return "home";
    }
}
