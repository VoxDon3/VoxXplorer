package ax.v4;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class g {
    public static final ax.T4.e a = new ax.T4.e();
    private static final TimeZone b = DesugarTimeZone.getTimeZone("UTC");
    private static final int c = "yyyy-MM-dd'T'HH:mm:ss'Z'".replace("'", HttpUrl.FRAGMENT_ENCODE_SET).length();
    private static final int d = "yyyy-MM-dd".replace("'", HttpUrl.FRAGMENT_ENCODE_SET).length();

    public static String a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setCalendar(new GregorianCalendar(b));
        return simpleDateFormat.format(date);
    }

    public static Date b(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat;
        int length = str.length();
        if (length == c) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        } else {
            if (length != d) {
                throw new ParseException("timestamp has unexpected format: '" + str + "'", 0);
            }
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        }
        simpleDateFormat.setCalendar(new GregorianCalendar(b));
        return simpleDateFormat.parse(str);
    }
}
