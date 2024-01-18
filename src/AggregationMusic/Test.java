package AggregationMusic;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    Artist a1 = new Artist("Taylor Swift", "The USA", "pop");
    Artist a2 = new Artist("Gorillaz", "The UK", "alternative rock");
    Artist a3 = new Artist("Radiohead", "The UK", "alternative rock");
    Artist a4 = new Artist("Jay-Z", "The USA", "rap");
    Artist a5 = new Artist("Kanye", "The USA", "rap");

     List<Artist> artistListT = new ArrayList<Artist>();
     artistListT.add(a1);

     List<Artist> artistListG = new ArrayList<Artist>();
     artistListG.add(a2);

     List<Artist> artistListR = new ArrayList<Artist>();
     artistListR.add(a3);

     List<Artist> artistListK = new ArrayList<Artist>();
     artistListK.add(a4);
     artistListK.add(a5);

     Album album1 = new Album("Midnights", "indie", artistListT, 2022);
     Album album2 = new Album("Demon Days", "hip hop", artistListG, 2005);
     Album album3 = new Album("In rainbows", "alternative rock", artistListR, 2007);
     Album album4 = new Album("Watch the Throne", "rap", artistListK, 2011);

    System.out.println(album2);
    System.out.println(album1);
    System.out.println(album4);
    System.out.println(album3);
    }

}
