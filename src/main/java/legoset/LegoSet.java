package legoset;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;

import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces", "packaging", "tags", "minifigs", "ratings"})
@Data
public class LegoSet {
    @XmlAttribute
    String number, url;
    String name, theme, subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    int pieces;
    enum Package {BOX, POLYBAG}
    Package packaging;
    @XmlElement(name = "tag")
    @XmlElementWrapper(name = "tags")
    Set<String> tags;
    @XmlElement(name = "minifig")
    @XmlElementWrapper(name = "minifigs")
    List<Minifig> minifigs;
    Ratings ratings;
}
