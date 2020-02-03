package bap.jp.ducquy.finalexam.finalexam.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "playlist")
public class Playlist {

    @Id
    @GeneratedValue
    @Column(name = "PlaylistId")
    private int id;

    @ManyToMany
    @JoinTable(name="playlistTrack",
            joinColumns = @JoinColumn(name="playlistId"),
            inverseJoinColumns = @JoinColumn(name="trackId"))
    @JsonIgnoreProperties("playlists")
    private Set<Track> tracks;

    @Column(name = "Name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
