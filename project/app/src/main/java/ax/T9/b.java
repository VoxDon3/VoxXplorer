/*
 * Decompiled with CFR 0.152.
 */
package ax.T9;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class b {
    public static Calendar a(String object) throws ParseException {
        Object object2;
        String string;
        if (((String)object).indexOf(90) != -1) {
            string = "Z";
            object = ((String)object).replace("Z", "+0000");
        } else {
            string = "";
        }
        if (((String)object).contains(".")) {
            String string2 = ((String)object).substring(((String)object).indexOf(".") + 1, ((String)object).indexOf("+"));
            object2 = object;
            if (string2.length() > 3) {
                string2 = string2.substring(0, 3);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(((String)object).substring(0, ((String)object).indexOf(".") + 1));
                ((StringBuilder)object2).append(string2);
                ((StringBuilder)object2).append(((String)object).substring(((String)object).indexOf("+")));
                object2 = ((StringBuilder)object2).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("yyyy-MM-dd'T'HH:mm:ss.SSS");
            ((StringBuilder)object).append(string);
            string = ((StringBuilder)object).toString();
            object = object2;
        } else {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("yyyy-MM-dd'T'HH:mm:ss");
            ((StringBuilder)object2).append(string);
            string = ((StringBuilder)object2).toString();
        }
        object2 = new SimpleDateFormat(string);
        ((DateFormat)object2).setTimeZone(TimeZone.getDefault());
        object2 = ((DateFormat)object2).parse((String)object);
        object = Calendar.getInstance();
        ((Calendar)object).setTime((Date)object2);
        return object;
    }

    public static String b(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        return simpleDateFormat.format(calendar.getTime());
    }
}

