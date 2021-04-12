package legoset;

import album.Album;
import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();

        legoset.setNumber("75211");
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setPackaging(LegoSet.Package.BOX);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoset.setMinifigs(List.of(new Minifig(2,"Imperial Mudtrooper"),
                                    new Minifig(1,"Imperial Pilot"),
                                    new Minifig(1,"Mimban Stormtrooper")));
        legoset.setRatings(new Ratings(468, 4.4));

        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }
}
