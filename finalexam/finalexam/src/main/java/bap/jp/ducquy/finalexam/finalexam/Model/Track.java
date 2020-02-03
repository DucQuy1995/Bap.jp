package bap.jp.ducquy.finalexam.finalexam.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue
    @Column(name = "TrackId")
    private int id;

    @OneToMany(mappedBy = "track")
    @JsonBackReference
    private List<InvoiceLine> invoiceLines;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "albumId")
    @JsonManagedReference
    private Album album;

    @ManyToOne
    @JoinColumn(name = "MediaTypeId")
    @JsonManagedReference
    private MediaType mediaType;

    @ManyToMany(mappedBy = "tracks")
    @JsonIgnoreProperties("tracks")
    private Set<Playlist> playlists;

    @ManyToOne
    @JoinColumn(name = "genreId")
    @JsonManagedReference
    private Genre genre;

    @Column(name = "Composer")
    private String composer;

    @Column(name = "Milliseconds")
    private int milliseconds;

    @Column(name = "Bytes")
    private int bytes;

    @Column(name = "UnitPrice")
    private float unitPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Set<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Set<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
