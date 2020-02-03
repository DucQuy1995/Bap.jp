package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public TrackService() {
    }

    public TrackRepository getTrackRepository() {
        return trackRepository;
    }

    public void setTrackRepository(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
}
