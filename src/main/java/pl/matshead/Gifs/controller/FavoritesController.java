package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Gif;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FavoritesController {
    @GetMapping("/favorites")
    public String getFavorites(ModelMap modelMap){
        List<Gif> newGifList = Gif.getGifs().stream().
                filter(s->s.getFavorite()==true).
                collect(Collectors.toCollection(ArrayList::new));
        modelMap.put("paths", newGifList);
        return "favorites";
    }
}
