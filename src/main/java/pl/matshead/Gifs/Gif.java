package pl.matshead.Gifs;

import java.util.ArrayList;
import java.util.List;

public class Gif {
    private String name;
    private Boolean favorite;
    private  List<Gif> gifs;

    public List<Gif> getGifs() {
        this.gifs.add(new Gif("android-explosion", false));
        this.gifs.add(new Gif("ben-and-mike", true));
        this.gifs.add(new Gif("compiler-bot", false));
        this.gifs.add(new Gif("cowboy-coder", false));
        this.gifs.add(new Gif("infinite-andrew", true));
        return gifs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Gif(String name, Boolean favorite) {
        this.name = name;
        this.favorite = favorite;
    }
    public Gif(){
        this.gifs = new ArrayList<>();
    }
}
