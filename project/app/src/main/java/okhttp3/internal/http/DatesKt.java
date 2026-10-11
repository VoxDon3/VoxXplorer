/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import ax.sb.t;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

public final class DatesKt {
    private static final DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;
    private static final STANDARD_DATE_FORMAT.1 STANDARD_DATE_FORMAT;

    static {
        STANDARD_DATE_FORMAT = new ThreadLocal<DateFormat>(){

            protected DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Util.UTC);
                return simpleDateFormat;
            }
        };
        String[] stringArray = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = stringArray;
        BROWSER_COMPATIBLE_DATE_FORMATS = new DateFormat[stringArray.length];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Date toHttpDateOrNull(String object) {
        l.f(object, "<this>");
        if (object.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Cloneable cloneable = ((DateFormat)STANDARD_DATE_FORMAT.get()).parse((String)object, parsePosition);
        if (parsePosition.getIndex() == ((String)object).length()) {
            return cloneable;
        }
        String[] stringArray = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (stringArray) {
            DateFormat[] dateFormatArray;
            int n8;
            try {
                int n9 = stringArray.length;
                for (n8 = 0; n8 < n9; cloneable = ((DateFormat)cloneable).parse((String)object, parsePosition), ++n8) {
                    dateFormatArray = BROWSER_COMPATIBLE_DATE_FORMATS;
                }
            }
            catch (Throwable throwable) {}
            {
                DateFormat dateFormat = dateFormatArray[n8];
                cloneable = dateFormat;
                if (dateFormat == null) {
                    cloneable = new SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[n8], Locale.US);
                    ((DateFormat)cloneable).setTimeZone(Util.UTC);
                    dateFormatArray[n8] = cloneable;
                }
                parsePosition.setIndex(0);
                int n10 = parsePosition.getIndex();
                if (n10 == 0) continue;
                return cloneable;
            }
            object = t.a;
            return null;
            throw throwable;
        }
    }

    public static final String toHttpDateString(Date object) {
        l.f(object, "<this>");
        object = ((DateFormat)STANDARD_DATE_FORMAT.get()).format((Date)object);
        l.e(object, "STANDARD_DATE_FORMAT.get().format(this)");
        return object;
    }
}

