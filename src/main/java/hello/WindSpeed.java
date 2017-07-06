package hello;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by hellange on 28/06/17.
 */
public class WindSpeed {

    @XmlAttribute(name = "id")
    public String id;

    @XmlAttribute(name = "mps")
    public String mps;

    @XmlAttribute(name = "beaufort")
    public String beaufort;

    @XmlAttribute(name = "name")
    public String name;

    @Override
    public String toString() {
        return "WindSpeed{" +
                "id='" + id + '\'' +
                ", mps='" + mps + '\'' +
                ", beaufort='" + beaufort + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
