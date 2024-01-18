package AggregationArray;

public class Author {
    private String name;
    private String surname;
    private String country;
    private char gender;

    public Author(String name, String surname, String country, char gender) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.gender = gender;
    }

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getCountry() {return country;}
    public char getGender() {return gender;}

    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setCountry(String country) {this.country = country;}
    public void setGender(char gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                '}';
    }
}
