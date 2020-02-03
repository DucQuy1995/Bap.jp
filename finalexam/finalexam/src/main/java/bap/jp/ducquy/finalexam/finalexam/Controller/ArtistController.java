package bap.jp.ducquy.finalexam.finalexam.Controller;

import bap.jp.ducquy.finalexam.finalexam.Model.Artist;
import bap.jp.ducquy.finalexam.finalexam.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {

    @Autowired
    public ArtistService artistService;

    @GetMapping("/Artist")
    public List<Artist> findAllArtist(){
        return artistService.findAll();
    }
}
