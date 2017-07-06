package hello;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by hellange on 28/06/17.
 */
public class Symbol {


    @XmlAttribute(name = "id")
    public String id;

    @XmlAttribute(name = "number")
    public String number;

    @Override
    public String toString() {
        return "Symbol{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
