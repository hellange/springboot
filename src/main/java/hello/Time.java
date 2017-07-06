package hello;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Time {

    @XmlAttribute(name = "from")
    public String from;

    @XmlAttribute(name = "to")
    public String to;

    @XmlElement(name = "location")
    public Location location;

    @Override
    public String toString() {
        return "Time{" +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                "location=" + location +
                '}';
    }
}