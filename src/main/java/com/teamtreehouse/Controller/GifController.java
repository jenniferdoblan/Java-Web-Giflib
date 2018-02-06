package com.teamtreehouse.Controller;

import com.teamtreehouse.data.GifRepository;
import com.teamtreehouse.model.gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {
    @Autowired //tells spring to auto assign as soon as needed
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        gif Gif = gifRepository.findByName(name);
        modelMap.put("gif",Gif);
        return "gif-details";
    }
}