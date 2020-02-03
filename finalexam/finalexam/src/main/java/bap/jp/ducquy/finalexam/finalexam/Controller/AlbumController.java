package bap.jp.ducquy.finalexam.finalexam.Controller;

import bap.jp.ducquy.finalexam.finalexam.Model.Album;
import bap.jp.ducquy.finalexam.finalexam.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/")
    public String helloWord(){
        return "This is the page about musics and artist";
    }

    @GetMapping("/album")
    public List<Album> showinfoAlbum(){
        return albumService.findAll();
    }
}
