package bap.jp.ducquy.finalexam.finalexam.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue
    @Column(name = "AlbumId")
    private int id;

    @OneToMany(mappedBy = "album")
    @JsonBackReference
    private List<Track> tracks;

    @Column(name = "Title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "artistId")
    @JsonManagedReference
    private Artist artist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
