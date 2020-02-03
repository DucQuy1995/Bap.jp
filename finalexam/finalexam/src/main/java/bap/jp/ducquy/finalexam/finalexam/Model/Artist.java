package bap.jp.ducquy.finalexam.finalexam.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue
    @Column(name = "ArtistId")
    private int id;

    @OneToMany(mappedBy = "artist")
    @JsonBackReference
    private List<Album> albums;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
