package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GifContoller {
    @GetMapping("/")
    public String home(){
        return "home";
        // /
    }

    @GetMapping("/categories")
    public String getCategories(){
        return "categories";
    }

    @GetMapping("/favorites")
    public String getFavorites(){
        return "favorites";
    }

}
