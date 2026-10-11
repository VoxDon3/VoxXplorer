package ax.H3;

import com.box.androidsdk.content.utils.FastDateFormat;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal<DateFormat> a = new C0087a();
    private static final FastDateFormat b = FastDateFormat.i("yyyy-MM-dd'T'HH:mm:ssZ");
    private static ConcurrentHashMap<String, TimeZone> c = new ConcurrentHashMap<>(10);

    /* renamed from: ax.H3.a$a, reason: collision with other inner class name */
    class C0087a extends ThreadLocal<DateFormat> {
        C0087a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        }
    }

    public static String a(Date date) {
        String c2 = b.c(date);
        return c2.substring(0, 22) + ":" + c2.substring(22);
    }

    private static TimeZone b(String str) {
        TimeZone timeZone = c.get(str);
        if (timeZone != null) {
            return timeZone;
        }
        if (str.equals("Z")) {
            TimeZone timeZone2 = DesugarTimeZone.getTimeZone("UTC");
            c.put(str, timeZone2);
            return timeZone2;
        }
        int parseInt = Integer.parseInt(str.substring(str.charAt(0) == '+' ? 1 : 0, 3));
        int parseInt2 = Integer.parseInt(str.substring(4));
        int i = 3600000 * parseInt;
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(parseInt < 0 ? i - (parseInt2 * 60000) : i + (parseInt2 * 60000), str);
        c.put(str, simpleTimeZone);
        return simpleTimeZone;
    }

    public static Date c(String str) throws ParseException {
        int parseInt = Integer.parseInt(str.substring(0, 4));
        int parseInt2 = Integer.parseInt(str.substring(5, 7)) - 1;
        int parseInt3 = Integer.parseInt(str.substring(8, 10));
        int parseInt4 = Integer.parseInt(str.substring(11, 13));
        int parseInt5 = Integer.parseInt(str.substring(14, 16));
        int parseInt6 = Integer.parseInt(str.substring(17, 19));
        Calendar calendar = Calendar.getInstance(b(str.substring(19)));
        calendar.set(14, 0);
        calendar.set(parseInt, parseInt2, parseInt3, parseInt4, parseInt5, parseInt6);
        return calendar.getTime();
    }
}
