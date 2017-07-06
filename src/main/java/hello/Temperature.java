package hello;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by hellange on 28/06/17.
 */
public class Temperature {

    @XmlAttribute(name = "id")
    public String id;

    @XmlAttribute(name = "unit")
    public String unit;

    @XmlAttribute(name = "value")
    public String value;

    @Override
    public String toString() {
        return "Temperature{" +
                "id='" + id + '\'' +
                ", unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
