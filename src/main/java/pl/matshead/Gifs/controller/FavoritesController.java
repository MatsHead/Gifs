package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.SampleData.GifSampleData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FavoritesController {
    @GetMapping("/favorites")
    public String getFavorites(ModelMap modelMap){
        GifSampleData gifSampleData = new GifSampleData();
        modelMap.put("paths", gifSampleData.getFavorites());
        return "favorites";
    }
}
