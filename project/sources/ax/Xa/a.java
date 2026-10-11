package ax.Xa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes3.dex */
public class a {
    public static Date a(String str) {
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return null;
        }
    }

    public static Calendar b(String str) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String replace = str.replace("Z", "+00:00");
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(replace.substring(0, 22) + replace.substring(23)));
            return calendar;
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid length", 0);
        }
    }
}
