/*
 * Decompiled with CFR 0.152.
 */
package ax.H3;

import com.box.androidsdk.content.utils.FastDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public final class a {
    private static final ThreadLocal<DateFormat> a = new ThreadLocal<DateFormat>(){

        protected DateFormat a() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        }
    };
    private static final FastDateFormat b = FastDateFormat.i("yyyy-MM-dd'T'HH:mm:ssZ");
    private static j.ConcurrentHashMap<String, TimeZone> c = new j.ConcurrentHashMap(10);

    public static String a(Date object) {
        object = b.c((Date)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((String)object).substring(0, 22));
        stringBuilder.append(":");
        stringBuilder.append(((String)object).substring(22));
        return stringBuilder.toString();
    }

    private static TimeZone b(String string) {
        TimeZone timeZone = (TimeZone)c.get((Object)string);
        if (timeZone != null) {
            return timeZone;
        }
        if (string.equals("Z")) {
            timeZone = java.util.DesugarTimeZone.getTimeZone((String)"UTC");
            c.put((Object)string, (Object)timeZone);
            return timeZone;
        }
        int n8 = 0;
        if (string.charAt(0) == '+') {
            n8 = 1;
        }
        n8 = Integer.parseInt(string.substring(n8, 3));
        int n9 = Integer.parseInt(string.substring(4));
        int n10 = 3600000 * n8;
        n8 = n8 < 0 ? n10 - n9 * 60000 : n10 + n9 * 60000;
        timeZone = new SimpleTimeZone(n8, string);
        c.put((Object)string, (Object)timeZone);
        return timeZone;
    }

    public static Date c(String object) throws ParseException {
        int n8 = Integer.parseInt(((String)object).substring(0, 4));
        int n9 = Integer.parseInt(((String)object).substring(5, 7));
        int n10 = Integer.parseInt(((String)object).substring(8, 10));
        int n11 = Integer.parseInt(((String)object).substring(11, 13));
        int n12 = Integer.parseInt(((String)object).substring(14, 16));
        int n13 = Integer.parseInt(((String)object).substring(17, 19));
        object = Calendar.getInstance(ax.H3.a.b(((String)object).substring(19)));
        ((Calendar)object).set(14, 0);
        ((Calendar)object).set(n8, n9 - 1, n10, n11, n12, n13);
        return ((Calendar)object).getTime();
    }
}

