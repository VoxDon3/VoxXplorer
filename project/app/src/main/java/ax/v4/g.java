/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import ax.T4.e;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

final class g {
    public static final e a = new e();
    private static final TimeZone b = java.util.DesugarTimeZone.getTimeZone((String)"UTC");
    private static final int c = "yyyy-MM-dd'T'HH:mm:ss'Z'".replace("'", "").length();
    private static final int d = "yyyy-MM-dd".replace("'", "").length();

    public static String a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        simpleDateFormat.setCalendar(new GregorianCalendar(b));
        return simpleDateFormat.format(date);
    }

    public static Date b(String string) throws ParseException {
        block4: {
            SimpleDateFormat simpleDateFormat;
            block3: {
                int n8;
                block2: {
                    n8 = string.length();
                    if (n8 != c) break block2;
                    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
                    break block3;
                }
                if (n8 != d) break block4;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            }
            simpleDateFormat.setCalendar(new GregorianCalendar(b));
            return simpleDateFormat.parse(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timestamp has unexpected format: '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        throw new ParseException(stringBuilder.toString(), 0);
    }
}

