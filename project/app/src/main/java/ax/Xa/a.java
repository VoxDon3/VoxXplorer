/*
 * Decompiled with CFR 0.152.
 */
package ax.Xa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class a {
    public static Date a(String object) {
        try {
            object = a.b((String)object).getTime();
            return object;
        }
        catch (ParseException parseException) {
            return null;
        }
    }

    public static Calendar b(String string) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        string = string.replace("Z", "+00:00");
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, 22));
            stringBuilder.append(string.substring(23));
            string = stringBuilder.toString();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new ParseException("Invalid length", 0);
        }
        calendar.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(string));
        return calendar;
    }
}

