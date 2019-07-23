package pl.matshead.Gifs.SampleData;

import org.springframework.stereotype.Component;
import pl.matshead.Gifs.Category;
import pl.matshead.Gifs.Gif;
import pl.matshead.Gifs.repositories.GifRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GifSampleData implements GifRepository {
    @Override
    public List<Gif> getGifs() {
        List<Gif> gifs = new ArrayList<>();
        gifs.add(new Gif("android-explosion", false, "1"));
        gifs.add(new Gif("ben-and-mike", true, "2"));
        gifs.add(new Gif("compiler-bot", false, "2"));
        gifs.add(new Gif("cowboy-coder", false, "3"));
        gifs.add(new Gif("infinite-andrew", true, "3"));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        List<Gif> newGifList = getGifs().stream().
                filter(s->s.getFavorite()==true).
                collect(Collectors.toCollection(ArrayList::new));
        return newGifList;
    }

    @Override
    public List<Gif> getGifsForCategory(String param) {
        List<Gif> gifForCategory = getGifs().stream()
                .filter(s->s.getCategoryId().toString().equals(param))
                .collect(Collectors.toCollection(ArrayList::new));
        return gifForCategory;
    }

    @Override
    public Category getCategory(String param) {
        Category cat= null;
        for (Category category : Category.getCategories()) {
            if (category.getId().toString().equals(param)) {
                cat = category;
                break;
            }
        }
        return cat;
    }

}
