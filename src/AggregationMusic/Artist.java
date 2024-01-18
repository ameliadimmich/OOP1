package AggregationMusic;

public class Artist {

    private String name;
    private String country;
    private String genre;

    public Artist(String name, String country, String genre) {
        this.name = name;
        this.country = country;
        this.genre = genre;
    }

    public String getName() {return name;}
    public String getCountry() {return country;}
    public String getGenre() {return genre;}

    public void setName(String name) {this.name = name;}
    public void setCountry(String country) {this.country = country;}
    public void setGenre(String genre) {this.genre = genre;}

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
