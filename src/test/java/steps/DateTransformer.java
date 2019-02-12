package steps;


import cucumber.api.Transformer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTransformer extends Transformer<Date> {

    @Override
    public Date transform(String date) {
        SimpleDateFormat pattern = new SimpleDateFormat("MM-dd-yyyy");
        try {
            return pattern.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}