package AggregationList;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Office o1 = new Office("BI-tech", "Wrocław");
        Office o2 = new Office("BI", "Warszawa");
        Office o3 = new Office("BI-office", "Poznań");

        List<Office> officeList = new ArrayList<Office>();
        officeList.add(o1);
        officeList.add(o2);
        officeList.add(o3);

        Company comp1 = new Company("BI", officeList);
        System.out.println(comp1);
    }
}
