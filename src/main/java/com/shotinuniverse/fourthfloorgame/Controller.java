package com.shotinuniverse.fourthfloorgame;

import com.shotinuniverse.fourthfloorgame.entities.Character;
import com.shotinuniverse.fourthfloorgame.entities.Level;
import com.shotinuniverse.fourthfloorgame.services.CharacterRepository;
import com.shotinuniverse.fourthfloorgame.services.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    LevelRepository levelItemRepo;
    @Autowired
    CharacterRepository characterItemRepo;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testConnect() {
        return "Test has been successfully!";
    }

    @RequestMapping(value = "/level/{number}", method = RequestMethod.GET)
    public Level getLevel(@PathVariable int number) {
        return levelItemRepo.findItemByNumber(number);
    }

    @RequestMapping(value = "/character/{id}", method = RequestMethod.GET)
    public Character getCharacter(@PathVariable int id) {
        return characterItemRepo.findItemById(id);
    }
}
