package hello;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by hellange on 28/06/17.
 */
public class WindDirection {

    @XmlAttribute(name = "id")
    public String id;

    @XmlAttribute(name = "deg")
    public Float deg;

    @XmlAttribute(name = "name")
    public String name;


    @Override
    public String toString() {
        return "WindDirection{" +
                "id='" + id + '\'' +
                ", deg='" + deg + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
