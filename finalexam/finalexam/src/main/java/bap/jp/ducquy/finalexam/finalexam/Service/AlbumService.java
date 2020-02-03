package bap.jp.ducquy.finalexam.finalexam.Service;


import bap.jp.ducquy.finalexam.finalexam.Model.Album;
import bap.jp.ducquy.finalexam.finalexam.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public AlbumService() {
    }

    public List<Album> findAll(){
        return albumRepository.findAll();
    }

    public AlbumRepository getAlbumRepository() {
        return albumRepository;
    }

    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
}
