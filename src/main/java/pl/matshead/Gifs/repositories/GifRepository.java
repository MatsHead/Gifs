package pl.matshead.Gifs.repositories;

import org.springframework.ui.ModelMap;
import pl.matshead.Gifs.Category;
import pl.matshead.Gifs.Gif;

import java.util.List;

public interface GifRepository {
    public List<Gif> getGifs();
    public List<Gif> getFavorites();
    public List<Gif> getGifsForCategory(String param);
    public Category getCategory(String param);
    public ModelMap checkAndPutToMap(ModelMap map, String name, List<Gif> list);
}
