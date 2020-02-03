package bap.jp.ducquy.finalexam.finalexam.Service;

import bap.jp.ducquy.finalexam.finalexam.Repository.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaTypeService {

    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    public MediaTypeService() {
    }

    public MediaTypeRepository getMediaTypeRepository() {
        return mediaTypeRepository;
    }

    public void setMediaTypeRepository(MediaTypeRepository mediaTypeRepository) {
        this.mediaTypeRepository = mediaTypeRepository;
    }
}
