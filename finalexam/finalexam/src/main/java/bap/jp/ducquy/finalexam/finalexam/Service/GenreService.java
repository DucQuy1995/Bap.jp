package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public GenreService() {
    }

    public GenreRepository getGenreRepository() {
        return genreRepository;
    }

    public void setGenreRepository(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
}
