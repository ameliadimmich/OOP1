package AggregationList;

import java.util.List;

public class Company {

    private String name;
    private List<Office> offices;

    public Company(String name, List<Office> offices) {
        this.name = name;
        this.offices = offices;
    }

    public String getName() {return name;}
    public List<Office> getOffices() {return offices;}

    public void setName(String name) {this.name = name;}
    public void setOffices(List<Office> offices) {this.offices = offices;}

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", offices=" + offices +
                '}';
    }
}
