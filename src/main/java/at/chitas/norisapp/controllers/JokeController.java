package at.chitas.norisapp.controllers;

import at.chitas.norisapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by: emil
 * Date: 10/18/21
 */
@Controller
public class JokeController {

    private final JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
