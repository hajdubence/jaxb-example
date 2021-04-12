package legoset;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
    @XmlAttribute
    int count;
    @XmlAttribute
    double avg;
}
