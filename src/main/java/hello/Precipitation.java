package hello;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by hellange on 28/06/17.
 */
public class Precipitation {


    @XmlAttribute(name = "unit")
    public String unit;

    @XmlAttribute(name = "value")
    public String value;

    @XmlAttribute(name = "minvalue")
    public String maxvalue;

    @XmlAttribute(name = "maxvalue")
    public String minvalue;


    @Override
    public String toString() {
        return "Precipitation{" +
                "unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                ", maxvalue='" + maxvalue + '\'' +
                ", minvalue='" + minvalue + '\'' +
                '}';
    }
}
