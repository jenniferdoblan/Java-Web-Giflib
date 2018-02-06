package com.teamtreehouse.data;
import com.teamtreehouse.model.gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component //
public class GifRepository {
    private static final List<gif> ALL_GIFS = Arrays.asList(
            new gif("android-explosion", 1, LocalDate.of(2015,2,13), "Chris Ramacciotti", false),
            new gif("ben-and-mike", 2, LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new gif("book-dominos",3, LocalDate.of(2015,9,15), "Craig Dennis", false),
            new gif("compiler-bot",2, LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new gif("cowboy-coder",1, LocalDate.of(2015,2,13), "Grace Hopper", false),
            new gif("infinite-andrew",3, LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public gif findByName(String name) {
        for (gif Gif : ALL_GIFS) { //gif, type
            if (Gif.getName().equals(name)) { //if the gif object has a name that equals the name that is passed in then return that gif object
                return Gif; //Gif, variable
            }
        }

        return null;
    }

    public List<gif> getAllGifs(){
        return ALL_GIFS;
    }

    public List<gif> findByCategoryId(int id){
        List<gif> gifs = new ArrayList<>();
        for(gif Gif : ALL_GIFS){
            if(Gif.getCategoryId() == id){
                gifs.add(Gif);
            }
        }
        return gifs;
    }
}
