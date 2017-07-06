package hello;

import javax.xml.bind.annotation.XmlAttribute;

public class Pressure {
    @XmlAttribute(name = "id")
    public String id;

    @XmlAttribute(name = "unit")
    public String unit;

    @XmlAttribute(name = "value")
    public String value;

    @Override
    public String toString() {
        return "Pressure{" +
                "id='" + id + '\'' +
                ", unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
