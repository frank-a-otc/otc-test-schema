package date.types;

import java.sql.Time;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimeAdapter extends XmlAdapter<String, Time> {
    public Time unmarshal(String v) throws Exception {
        return Time.valueOf(v);
    }

    public String marshal(Time v) throws Exception {
        return v.toString();
    }
}