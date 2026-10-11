package ax.T9;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class b {
    public static Calendar a(String str) throws ParseException {
        String str2;
        String str3;
        if (str.indexOf(90) != -1) {
            str2 = "Z";
            str = str.replace("Z", "+0000");
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str.contains(".")) {
            String substring = str.substring(str.indexOf(".") + 1, str.indexOf("+"));
            if (substring.length() > 3) {
                str = str.substring(0, str.indexOf(".") + 1) + substring.substring(0, 3) + str.substring(str.indexOf("+"));
            }
            str3 = "yyyy-MM-dd'T'HH:mm:ss.SSS" + str2;
        } else {
            str3 = "yyyy-MM-dd'T'HH:mm:ss" + str2;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str3);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Date parse = simpleDateFormat.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        return calendar;
    }

    public static String b(Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(calendar.getTime());
    }
}
