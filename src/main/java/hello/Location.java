package hello;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Location {


    @XmlElement(name = "pressure")
    public Pressure pressure;

    @XmlElement(name = "windDirection")
    public WindDirection windDirection;

    @XmlElement(name = "windSpeed")
    public WindSpeed windSpeed;

    @XmlElement(name = "temperature")
    public Temperature temperature;

    @XmlAttribute(name = "altitude")
    public String altitude;

    @XmlAttribute(name = "longitude")
    public String longitude;

    @XmlAttribute(name = "latitude")
    public String latitude;

    /* Alternate content */

    @XmlElement(name = "precipitation")
    public Precipitation precipitation;

    @XmlElement(name = "symbol")
    public Symbol symbol;


    @Override
    public String toString() {
        return "Location{" +
                "pressure=" + pressure +
                ", windDirection=" + windDirection +
                ", windSpeed=" + windSpeed +
                ", temperature=" + temperature +
                ", altitude='" + altitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", precipitation=" + precipitation +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
