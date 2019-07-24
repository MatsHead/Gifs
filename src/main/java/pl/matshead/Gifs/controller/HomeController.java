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
        if (q != null) {
            List<Gif> paths = new ArrayList<>();
            Gif gif = Gif.getGifByName(q, gifRepository.getGifs());
            if (gif != null) {
                paths.add(gif);
                modelMap.put("paths", paths);
            } else {
                modelMap.put("paths", null);
            }

        } else {
            modelMap.put("paths", gifRepository.getGifs());
        }
        return "home";
    }
}
