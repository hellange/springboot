package hello;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "weatherdata")
public class WeatherData {

    @XmlElement
    public Product product;

}