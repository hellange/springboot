package hello;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Product {
    @XmlAttribute(name = "class")
    public String xclass;

    @XmlElement(name = "time")
    public Time[] xtime;
}