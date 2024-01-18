package AggregationMusic;
import java.util.List;

public class Album {

    private String name;
    private String genre;
    private List<Artist> artist;
    private int year;

    public Album(String name, String genre, List<Artist> artist, int year) {
        this.name = name;
        this.genre = genre;
        this.artist = artist;
        this.year = year;
    }

    public String getName() {return name;}
    public String getGenre() {return genre;}
    public List<Artist> getArtist() {return artist;}
    public int getYear() {return year;}

    public void setName(String name) {this.name = name;}
    public void setGenre(String genre) {this.genre = genre;}
    public void setArtist(List<Artist> artist) {this.artist = artist;}
    public void setYear(int year) {this.year = year;}

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", artist=" + artist +
                ", year=" + year +
                '}';
    }
}
