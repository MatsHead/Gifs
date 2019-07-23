package pl.matshead.Gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GifContoller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
