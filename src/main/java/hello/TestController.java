package hello;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String forecast() {
        String soapmessageString = "<xml>HELGE 4</xml>";
        JSONObject soapDatainJsonObject = null;
        try {
            soapDatainJsonObject= XML.toJSONObject(soapmessageString);

        } catch (Exception ex) {
            System.out.println("Exception "+ ex);
        }
        return soapDatainJsonObject.toString();

    }



}


