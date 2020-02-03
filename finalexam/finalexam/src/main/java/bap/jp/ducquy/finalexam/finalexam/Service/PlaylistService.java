package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public PlaylistService() {
    }

    public PlaylistRepository getPlaylistRepository() {
        return playlistRepository;
    }

    public void setPlaylistRepository(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }
}
