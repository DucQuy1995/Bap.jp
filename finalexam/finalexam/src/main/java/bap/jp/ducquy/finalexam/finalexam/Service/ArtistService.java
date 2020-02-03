package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Model.Artist;
import bap.jp.ducquy.finalexam.finalexam.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public ArtistService() {
    }

    public ArtistRepository getArtistRepository() {
        return artistRepository;
    }

    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> findAll(){
        return artistRepository.findAll();
    }
}
